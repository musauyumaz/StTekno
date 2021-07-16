package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.PowerFactorView;

public interface PowerFactorService {
	DataResult<List<PowerFactorView>> viewGetAll();
	DataResult<PowerFactorView> getLast();
}
