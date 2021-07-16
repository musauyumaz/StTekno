package sttekno.analizor.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;


import sttekno.analizor.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

	Customer findByIsActiveAndEmail(boolean isActive,String email);
	
}
