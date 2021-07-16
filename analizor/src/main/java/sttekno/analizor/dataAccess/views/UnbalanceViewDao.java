package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sttekno.analizor.entities.views.UnbalanceView;

public interface UnbalanceViewDao extends JpaRepository<UnbalanceView, Integer>{
	
	@Query("From UnbalanceView where id =(select max(id) from UnbalanceView)")
	UnbalanceView getLast();
}
