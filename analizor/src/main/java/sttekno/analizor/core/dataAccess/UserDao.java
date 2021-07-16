package sttekno.analizor.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import sttekno.analizor.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User getByEmailAndPassword(String email,String password);
	User findByEmail(String email);
}
