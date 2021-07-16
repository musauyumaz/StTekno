package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sttekno.analizor.entities.views.EnergyView;

public interface EnergyViewDao extends JpaRepository<EnergyView, Integer>{
	@Query("From EnergyView Where id=(select max(id) from EnergyView)")
	EnergyView getLast();
}
