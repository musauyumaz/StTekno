package sttekno.analizor.dataAccess.views;



import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sttekno.analizor.entities.views.PhaseVoltageView;

public interface PhaseVoltageViewDao extends JpaRepository<PhaseVoltageView, Integer>{
	
	List<PhaseVoltageView> getByAnalizorName(String analizorName);
	
	@Query("From PhaseVoltageView Where id=(select max(id) from PhaseVoltageView)")
	PhaseVoltageView getLast();
	
	
}
