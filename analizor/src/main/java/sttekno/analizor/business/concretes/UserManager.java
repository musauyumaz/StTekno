package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import sttekno.analizor.business.abstracts.UserService;
import sttekno.analizor.core.dataAccess.UserDao;
import sttekno.analizor.core.entities.User;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.core.utilites.results.SuccessDataResult;



@Service
public class UserManager implements UserService{
	private UserDao userDao;
	

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		
		
		
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(),"Data Getirildi");
	}

	@Override
	public DataResult<User> getByEmailAndPassword(String email, String password) {
		return new SuccessDataResult<User>(userDao.getByEmailAndPassword(email, password),"Kullanıcı Bulundu");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(userDao.findByEmail(email));
	}

	

	
		
	

}
