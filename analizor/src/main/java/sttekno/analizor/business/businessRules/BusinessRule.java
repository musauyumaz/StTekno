package sttekno.analizor.business.businessRules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.core.utilites.results.SuccessResult;



@Service
public class BusinessRule {

	@Autowired
    public static Result Run(Result... results)
    {		
        for (Result result : results) {
             if (!result.isSuccess())
            {
                return result;
            }
        }
      
     
         return new SuccessResult();
           
       
    }
}
