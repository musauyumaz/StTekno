package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.LineVoltageView;


public interface LineVoltageService {
	DataResult<List<LineVoltageView>> viewGetAll();
	DataResult<LineVoltageView> getLast();
}
