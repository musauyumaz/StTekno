package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.EnergyView;


public interface EnergyService {
	DataResult<List<EnergyView>> viewGetAll();
	DataResult<EnergyView> getLast();
}
