package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.PhaseVoltage;
import sttekno.analizor.entities.views.PhaseVoltageView;


public interface PhaseVoltageService {
	DataResult<List<PhaseVoltage>> getAll();
	DataResult<List<PhaseVoltageView>> viewGetAll();
	DataResult<List<PhaseVoltageView>> getByAnalizorName(String analizorName);
	DataResult<PhaseVoltageView> getLast();
	
}
