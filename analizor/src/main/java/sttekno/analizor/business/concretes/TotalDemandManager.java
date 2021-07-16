package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.TotalDemandService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.dataAccess.views.TotalDemandViewDao;
import sttekno.analizor.entities.views.TotalDemandView;

@Service
public class TotalDemandManager implements TotalDemandService{
	private TotalDemandViewDao totalDemandViewDao;
	
	@Autowired
	public TotalDemandManager(TotalDemandViewDao totalDemandViewDao) {
		super();
		this.totalDemandViewDao = totalDemandViewDao;
	}

	@Override
	public DataResult<List<TotalDemandView>> viewGetAll() {
		return new SuccessDataResult<List<TotalDemandView>>(totalDemandViewDao.findAll(),"Data Getirildi");
	}

	@Override
	public DataResult<TotalDemandView> getLast() {
		return new SuccessDataResult<TotalDemandView>(totalDemandViewDao.getLast());
	}
	
}
