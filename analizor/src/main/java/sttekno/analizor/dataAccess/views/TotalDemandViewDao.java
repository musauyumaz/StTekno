package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import sttekno.analizor.entities.views.TotalDemandView;

public interface TotalDemandViewDao extends JpaRepository<TotalDemandView, Integer>{
	
	@Query("From TotalDemandView Where id=(select max(id) from TotalDemandView)")
	TotalDemandView getLast();
}
