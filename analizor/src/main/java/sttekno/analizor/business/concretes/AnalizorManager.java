package sttekno.analizor.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.business.abstracts.AnalizorService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.core.utilites.results.SuccessDataResult;
import sttekno.analizor.core.utilites.results.SuccessResult;
import sttekno.analizor.dataAccess.AnalizorDao;
import sttekno.analizor.entities.Analizor;

@Service
public class AnalizorManager implements AnalizorService{
	private AnalizorDao analizorDao;

	@Autowired
	public AnalizorManager(AnalizorDao analizorDao) {
		super();
		this.analizorDao = analizorDao;
	}

	@Override
	public DataResult<List<Analizor>> getAll() {
		return new SuccessDataResult<List<Analizor>>(analizorDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Analizor analizor) {
		analizorDao.save(analizor);
		return new SuccessResult(analizor.getAnalizorName()+" Eklendi");
	}
	
}
