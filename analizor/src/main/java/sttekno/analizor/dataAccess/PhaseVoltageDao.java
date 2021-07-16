package sttekno.analizor.dataAccess;



import org.springframework.data.jpa.repository.JpaRepository;

import sttekno.analizor.entities.PhaseVoltage;


public interface PhaseVoltageDao extends JpaRepository<PhaseVoltage, Integer>{
	
}
