package sttekno.analizor.business.abstracts;

import java.util.List;

import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.entities.Analizor;

public interface AnalizorService {
	DataResult<List<Analizor>> getAll();
	Result add(Analizor analizor);
}
