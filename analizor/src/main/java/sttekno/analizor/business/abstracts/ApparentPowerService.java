package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.ApparentPowerView;


public interface ApparentPowerService {
	DataResult<List<ApparentPowerView>> viewGetAll();
	DataResult<ApparentPowerView> getLast();
}
