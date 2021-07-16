package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sttekno.analizor.entities.views.ApparentPowerView;


public interface ApparentPowerViewDao extends JpaRepository<ApparentPowerView, Integer>{
	
	@Query("From ApparentPowerView Where id=(select max(id) from ApparentPowerView)")
	ApparentPowerView getLast();
}
