package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.CurrentService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.CurrentViewDao;
import sttekno.analizor.entities.views.CurrentView;

@Service
public class CurrentManager implements CurrentService{
	private CurrentViewDao currentViewDao;
	@Autowired
	public CurrentManager(CurrentViewDao currentViewDao) {
		super();
		this.currentViewDao = currentViewDao;
	}
	@Override
	public DataResult<List<CurrentView>> viewGetAll() {
		return new SuccessDataResult<List<CurrentView>>(currentViewDao.findAll(),"Data Listelendi");
	}
	@Override
	public DataResult<CurrentView> getLast() {
		return new SuccessDataResult<CurrentView>(currentViewDao.getLast());
	}
	
}
