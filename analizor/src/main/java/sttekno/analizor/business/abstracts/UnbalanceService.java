package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.UnbalanceView;


public interface UnbalanceService {
	DataResult<List<UnbalanceView>> viewGetAll();
	DataResult<UnbalanceView> getLast();
}
