package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.ReactivePowerView;

public interface ReactivePowerService {
	DataResult<List<ReactivePowerView>> viewGetAll();
	DataResult<ReactivePowerView> getLast();
}
