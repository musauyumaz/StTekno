package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.ActivePowerView;


public interface ActivePowerService {
	DataResult<List<ActivePowerView>> viewGetAll();
	DataResult<ActivePowerView> getLast();
}
