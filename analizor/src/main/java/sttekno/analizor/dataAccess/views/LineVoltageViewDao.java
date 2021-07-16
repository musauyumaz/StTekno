package sttekno.analizor.dataAccess.views;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import sttekno.analizor.entities.views.LineVoltageView;

public interface LineVoltageViewDao extends JpaRepository<LineVoltageView, Integer>{
	
	@Query("From LineVoltageView Where id=(select max(id) from LineVoltageView)")
	LineVoltageView getLast();
}
