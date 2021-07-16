package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.ApparentPowerService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.ApparentPowerViewDao;
import sttekno.analizor.entities.views.ApparentPowerView;

@Service
public class ApparentPowerManager implements ApparentPowerService{

	private ApparentPowerViewDao apparentPowerViewDao;
	@Autowired
	public ApparentPowerManager(ApparentPowerViewDao apparentPowerViewDao) {
		super();
		this.apparentPowerViewDao = apparentPowerViewDao;
	}

	@Override
	public DataResult<List<ApparentPowerView>> viewGetAll() {
		return new SuccessDataResult<List<ApparentPowerView>>(apparentPowerViewDao.findAll(),"Data Listelendi");
	}

	@Override
	public DataResult<ApparentPowerView> getLast() {
		return new SuccessDataResult<ApparentPowerView>(apparentPowerViewDao.getLast());
	}

}
