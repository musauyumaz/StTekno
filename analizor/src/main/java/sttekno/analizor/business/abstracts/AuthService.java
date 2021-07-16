package sttekno.analizor.business.abstracts;

import sttekno.analizor.core.utilites.results.Result;

import sttekno.analizor.entities.dtos.CustomerForRegisterDto;
import sttekno.analizor.entities.dtos.UserForLoginDto;

public interface AuthService {
	Result registerCustomer(CustomerForRegisterDto customerForRegisterDto);
	Result loginUser(UserForLoginDto userForLoginDto);
}
