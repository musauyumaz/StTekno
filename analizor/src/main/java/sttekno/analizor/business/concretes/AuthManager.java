package sttekno.analizor.business.concretes;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.AuthService;
import sttekno.analizor.business.abstracts.CustomerService;
import sttekno.analizor.business.abstracts.UserService;
import sttekno.analizor.business.businessRules.BusinessRule;
import sttekno.analizor.core.entities.User;
import sttekno.analizor.core.utilites.results.ErrorResult;
import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.core.utilites.results.SuccessResult;
import sttekno.analizor.entities.Customer;
import sttekno.analizor.entities.dtos.CustomerForRegisterDto;
import sttekno.analizor.entities.dtos.UserForLoginDto;
@Service
public class AuthManager implements AuthService{

	private UserService userService;
	private CustomerService customerService;
	private ModelMapper modelMapper;
	@Autowired
	public AuthManager(UserService userService, CustomerService customerService,ModelMapper modelMapper) {
		super();
		this.userService = userService;
		this.customerService = customerService;
		this.modelMapper = modelMapper;
	}

	@Override
	public Result registerCustomer(CustomerForRegisterDto customerForRegisterDto) {
		Customer customer = modelMapper.map(customerForRegisterDto, Customer.class);
		Result businessRule1 = BusinessRule.Run(passwordControl(customerForRegisterDto.getPassword(), customerForRegisterDto.getPasswordAgain()),checkEmailExists(customerForRegisterDto.getEmail()));
		
		if(businessRule1.isSuccess()) {
			customerService.add(customer);
			
			return new SuccessResult(customer.getFirstName() + " Sisteme Dahil Oldu Hayırlı Olsun!!!");
		}else {
			
		}
		return new ErrorResult(businessRule1.getMessage());
	}

	@Override
	public Result loginUser(UserForLoginDto userForLoginDto) {
		
		User user = modelMapper.map(userForLoginDto, User.class);
		
		Result businessRule2 = BusinessRule.Run(login(userForLoginDto.getEmail(), userForLoginDto.getPassword()),activation(true, userForLoginDto.getEmail()));
		
		if(businessRule2.isSuccess()) {
			return new SuccessResult( user.getEmail()+" Giriş Sağlandı");
		}else {
		return new ErrorResult(businessRule2.getMessage());
		
		}
	}
	
	
	
	private Result passwordControl(String password, String confirmPassword) {
		if (password.equals(confirmPassword)) {
			return new SuccessResult("Şifre Onaylandı ve Kaydedildi");
			
			
		}else {
			return new ErrorResult("Şifreler Uyuşmuyor Lütfen kontrol ediniz");
		}

		
	}

	
	private Result checkEmailExists(String email) {
		if(this.userService.findByEmail(email).getData()==null) {
			return new SuccessResult("Email Kayıt Edilmeye Hazır");
			
		}else {
			return new ErrorResult("Email Sistemimize Kayıtlıdır");
		}
	}
	
	private Result login(String email ,String password) {
		if(userService.getByEmailAndPassword(email, password).getData() != null) {
			return new SuccessResult("Giriş Sağlandı");
		}
		else {
			return new ErrorResult("Email Ve Şifrenizi Kontrol Ediniz");
		}
	}
	private Result activation(boolean isActive,String email) {
		if(customerService.findByIsActiveAndEmail(isActive, email).getData()!= null) {
			return new SuccessResult(email+ "Sisteme Giriş Yapılabilir Gerekli Kontroller sağlandı");
		}else {
			return new ErrorResult("Aktivasyon İşlemlerini Lütfen Bizimle Görüşün TEL: 0344 236 0706");
		}
	}
	
	
	
		
		
}
