package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.PowerFactorService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.PowerFactorView;

@RestController
@RequestMapping("/api/powerfactors")
public class PowerFactorsController {
	private PowerFactorService powerFactorService;
	
	@Autowired
	public PowerFactorsController(PowerFactorService powerFactorService) {
		super();
		this.powerFactorService = powerFactorService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<PowerFactorView>> viewGetAll(){
		return powerFactorService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<PowerFactorView> getLast(){
		return powerFactorService.getLast();
	}
	
}
