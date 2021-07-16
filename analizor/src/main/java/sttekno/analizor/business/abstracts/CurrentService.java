package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.CurrentView;


public interface CurrentService {
	DataResult<List<CurrentView>> viewGetAll();
	DataResult<CurrentView> getLast();
}
