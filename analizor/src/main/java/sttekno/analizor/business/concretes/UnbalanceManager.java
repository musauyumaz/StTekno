package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.UnbalanceService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.UnbalanceViewDao;
import sttekno.analizor.entities.views.UnbalanceView;

@Service
public class UnbalanceManager implements UnbalanceService{
private UnbalanceViewDao unbalanceViewDao;
	
	@Autowired
	public UnbalanceManager(UnbalanceViewDao unbalanceViewDao) {
	super();
	this.unbalanceViewDao = unbalanceViewDao;
}
	@Override
	public DataResult<List<UnbalanceView>> viewGetAll() {
		return new SuccessDataResult<List<UnbalanceView>>(unbalanceViewDao.findAll(),"Data Getirildi");
	}
	@Override
	public DataResult<UnbalanceView> getLast() {
		return new SuccessDataResult<UnbalanceView>(unbalanceViewDao.getLast());
	}

}
