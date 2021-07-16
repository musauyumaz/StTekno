package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sttekno.analizor.entities.views.ReactivePowerView;

public interface ReactivePowerViewDao extends JpaRepository<ReactivePowerView, Integer>{

	@Query("From ReactivePowerView Where id=(select max(id) from ReactivePowerView)")
	ReactivePowerView getLast();
}
