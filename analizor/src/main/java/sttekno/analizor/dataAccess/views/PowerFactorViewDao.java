package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import sttekno.analizor.entities.views.PowerFactorView;

public interface PowerFactorViewDao extends JpaRepository<PowerFactorView, Integer>{
	
	@Query("From PowerFactorView Where id=(select max(id) from PowerFactorView)")
	PowerFactorView getLast();
}
