package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.PhaseVoltageService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.PhaseVoltage;
import sttekno.analizor.entities.views.PhaseVoltageView;


@RestController
@RequestMapping("/api/phasevoltagecontrollers")
public class PhaseVoltagesController {
	private PhaseVoltageService phasevoltageService;
	
	@Autowired
	public PhaseVoltagesController(PhaseVoltageService phasevoltageService) {
		super();
		this.phasevoltageService = phasevoltageService;
	}
	@GetMapping("/getall")
	public DataResult<List<PhaseVoltage>> getAll(){
		return phasevoltageService.getAll();
	}
	@GetMapping("/viewgetall")
	public DataResult<List<PhaseVoltageView>> viewGetAll(){
		return phasevoltageService.viewGetAll();
	}
	@GetMapping("/getByAnalizorName")
	public DataResult<List<PhaseVoltageView>> getByAnalizorName(@RequestParam String analizorName){
		return phasevoltageService.getByAnalizorName(analizorName);
	}
	@GetMapping("/getLast")
	public DataResult<PhaseVoltageView> getLast() {
		return phasevoltageService.getLast();
	}
	

}
