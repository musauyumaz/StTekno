package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.PowerFactorService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.PowerFactorViewDao;
import sttekno.analizor.entities.views.PowerFactorView;

@Service
public class PowerFactorManager  implements PowerFactorService{
	private PowerFactorViewDao powerFactorViewDao;
	@Autowired
	public PowerFactorManager(PowerFactorViewDao powerFactorViewDao) {
		super();
		this.powerFactorViewDao = powerFactorViewDao;
	}

	@Override
	public DataResult<List<PowerFactorView>> viewGetAll() {
		return new SuccessDataResult<List<PowerFactorView>>(powerFactorViewDao.findAll(),"Data Getirildi");
	}

	@Override
	public DataResult<PowerFactorView> getLast() {
		return new SuccessDataResult<PowerFactorView>(powerFactorViewDao.getLast());
	}
}
