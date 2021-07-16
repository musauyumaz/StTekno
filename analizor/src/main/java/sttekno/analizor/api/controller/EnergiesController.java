package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.EnergyService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.EnergyView;

@RestController
@RequestMapping("/api/energies")
public class EnergiesController {
	private EnergyService  energyService;
	@Autowired
	public EnergiesController(EnergyService energyService) {
		super();
		this.energyService = energyService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<EnergyView>> viewGetAll(){
		return energyService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<EnergyView> getLast(){
		return energyService.getLast();
	}
}
