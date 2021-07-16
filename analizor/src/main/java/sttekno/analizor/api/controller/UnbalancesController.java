package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.UnbalanceService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.UnbalanceView;

@RestController
@RequestMapping("/api/unbalances")
public class UnbalancesController {
	private UnbalanceService unbalanceService;
	
	@Autowired
	public UnbalancesController(UnbalanceService unbalanceService) {
		super();
		this.unbalanceService = unbalanceService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<UnbalanceView>> viewGetAll(){
		return unbalanceService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<UnbalanceView> getLast(){
		return unbalanceService.getLast();
	}
}
