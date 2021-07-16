package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.ReactivePowerService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.ReactivePowerViewDao;
import sttekno.analizor.entities.views.ReactivePowerView;

@Service
public class ReactivePowerManager implements ReactivePowerService{
	private ReactivePowerViewDao reactivePowerViewDao;
	
	 @Autowired
	public ReactivePowerManager(ReactivePowerViewDao reactivePowerViewDao) {
		super();
		this.reactivePowerViewDao = reactivePowerViewDao;
	}

	@Override
	public DataResult<List<ReactivePowerView>> viewGetAll() {
		return new SuccessDataResult<List<ReactivePowerView>>(reactivePowerViewDao.findAll(),"Data Getirildi");
	}

	@Override
	public DataResult<ReactivePowerView> getLast() {
		return new SuccessDataResult<ReactivePowerView>(reactivePowerViewDao.getLast());
	}
}
