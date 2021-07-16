package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.ActivePowerService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.ActivePowerViewDao;
import sttekno.analizor.entities.views.ActivePowerView;

@Service
public class ActivePowerManager implements ActivePowerService{
	private ActivePowerViewDao activePowerViewDao;

	@Autowired
	public ActivePowerManager(ActivePowerViewDao activePowerViewDao) {
		super();
		this.activePowerViewDao = activePowerViewDao;
	}

	@Override
	public DataResult<List<ActivePowerView>> viewGetAll() {
		return new SuccessDataResult<List<ActivePowerView>>(activePowerViewDao.findAll(),"Data Listelendi");
	}

	@Override
	public DataResult<ActivePowerView> getLast() {
		return new SuccessDataResult<ActivePowerView>(activePowerViewDao.getLast());
	}
	
}
