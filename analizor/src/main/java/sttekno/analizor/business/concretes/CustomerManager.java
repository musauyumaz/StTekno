package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.CustomerService;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.core.utilites.results.SuccessResult;
import sttekno.analizor.dataAccess.CustomerDao;
import sttekno.analizor.entities.Customer;

@Service
public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public DataResult<List<Customer>> getAll() {
		return new SuccessDataResult<List<Customer>>(customerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Customer customer) {
		customerDao.save(customer);
		return new SuccessResult(customer.getFirstName()+" Eklendi");
	}

	@Override
	public Result delete(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Customer> findByIsActiveAndEmail(boolean isActive, String email) {
		return new SuccessDataResult<Customer>(customerDao.findByIsActiveAndEmail(isActive, email));
	}

	
	
}
