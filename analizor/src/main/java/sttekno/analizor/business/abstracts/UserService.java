package sttekno.analizor.business.abstracts;

import java.util.List;


import sttekno.analizor.core.entities.User;
import sttekno.analizor.core.utilites.results.DataResult;



public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmailAndPassword(String email,String password);
	DataResult<User> findByEmail(String email);

	
	
	
}
