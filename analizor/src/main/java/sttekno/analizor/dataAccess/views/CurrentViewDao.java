package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import sttekno.analizor.entities.views.CurrentView;

public interface CurrentViewDao extends JpaRepository<CurrentView, Integer>{
	
	@Query("From CurrentView Where id=(select max(id) from CurrentView)")
	CurrentView getLast();
}
