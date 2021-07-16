package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sttekno.analizor.entities.views.ActivePowerView;


public interface ActivePowerViewDao extends JpaRepository<ActivePowerView, Integer> {
	@Query("From ActivePowerView Where id=(select max(id) from ActivePowerView)")
	ActivePowerView getLast();
}
