package sttekno.analizor.business.abstracts;

import java.util.List;


import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.entities.Customer;

public interface CustomerService {
	DataResult<List<Customer>> getAll();
	Result add(Customer customer);
	Result delete(Customer customer);
	Result update(Customer customer);
	DataResult<Customer>findByIsActiveAndEmail(boolean isActive,String email);

}
