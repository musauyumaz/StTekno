package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.PhaseVoltageService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.PhaseVoltageDao;
import sttekno.analizor.dataAccess.views.PhaseVoltageViewDao;
import sttekno.analizor.entities.PhaseVoltage;
import sttekno.analizor.entities.views.PhaseVoltageView;


@Service
public class PhaseVoltageManager implements PhaseVoltageService{
	
	
	private PhaseVoltageDao phaseVoltageDao;
	private PhaseVoltageViewDao phaseVoltageViewDao;
	
	@Autowired
	public PhaseVoltageManager(PhaseVoltageDao phaseVoltageDao,PhaseVoltageViewDao phaseVoltageViewDao) {
		
		this.phaseVoltageDao = phaseVoltageDao;
		this.phaseVoltageViewDao = phaseVoltageViewDao;

}
	@Override
	public DataResult<List<PhaseVoltage>> getAll() {
		return new SuccessDataResult<List<PhaseVoltage>>(phaseVoltageDao.findAll(),"Data Getirildi");
	}
	@Override
	public DataResult<List<PhaseVoltageView>> viewGetAll() {
		return new SuccessDataResult<List<PhaseVoltageView>>(phaseVoltageViewDao.findAll(),"Data Listelendi");
	}
	@Override
	public DataResult<List<PhaseVoltageView>> getByAnalizorName(String analizorName) {
		return new SuccessDataResult<List<PhaseVoltageView>>(phaseVoltageViewDao.getByAnalizorName(analizorName),analizorName + " Listelendi");
	}
	@Override
	public DataResult<PhaseVoltageView> getLast() {
		return new SuccessDataResult<PhaseVoltageView>(phaseVoltageViewDao.getLast());
	}
	}
