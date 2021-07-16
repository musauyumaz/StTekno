package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.TotalDemandView;

public interface TotalDemandService {
	DataResult<List<TotalDemandView>> viewGetAll();
	DataResult<TotalDemandView> getLast();
}
