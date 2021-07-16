package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.TotalDemandService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.TotalDemandView;

@RestController
@RequestMapping("/api/totaldemands")
public class TotalDemandsController {
	private TotalDemandService totalDemandService;
	
	@Autowired
	public TotalDemandsController(TotalDemandService totalDemandService) {
		super();
		this.totalDemandService = totalDemandService;
	}
	@GetMapping("viewgetall")
	public DataResult<List<TotalDemandView>> viewGetAll(){
		return totalDemandService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<TotalDemandView> getLast(){
		return totalDemandService.getLast();
	}
	
}
