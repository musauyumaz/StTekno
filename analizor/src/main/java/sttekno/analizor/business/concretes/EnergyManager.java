package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.EnergyService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.EnergyViewDao;
import sttekno.analizor.entities.views.EnergyView;

@Service
public class EnergyManager implements EnergyService{
	private EnergyViewDao energyViewDao;
	@Autowired
	public EnergyManager(EnergyViewDao energyViewDao) {
		super();
		this.energyViewDao = energyViewDao;
	}
	@Override
	public DataResult<List<EnergyView>> viewGetAll() {
		return new SuccessDataResult<List<EnergyView>>(energyViewDao.findAll(),"Data Getirildi");
	}
	@Override
	public DataResult<EnergyView> getLast() {
		return new SuccessDataResult<EnergyView>(energyViewDao.getLast());
	}
}
