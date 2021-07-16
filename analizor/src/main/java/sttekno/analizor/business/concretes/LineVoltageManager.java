package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.LineVoltageService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.LineVoltageViewDao;
import sttekno.analizor.entities.views.LineVoltageView;

@Service
public class LineVoltageManager implements LineVoltageService{
	private LineVoltageViewDao lineVoltageViewDao;
	@Autowired
	public LineVoltageManager(LineVoltageViewDao lineVoltageViewDao) {
		super();
		this.lineVoltageViewDao = lineVoltageViewDao;
	}
	@Override
	public DataResult<List<LineVoltageView>> viewGetAll() {
		return new SuccessDataResult<List<LineVoltageView>>(lineVoltageViewDao.findAll(),"Data Getirildi");
	}
	@Override
	public DataResult<LineVoltageView> getLast() {
		return new SuccessDataResult<LineVoltageView>(lineVoltageViewDao.getLast());
	}
}
