package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.ApparentPowerService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.ApparentPowerView;


@RestController
@RequestMapping("/api/apparentpowers")
public class ApparentPowersController {
	private ApparentPowerService apparentPowerService;

	@Autowired
	public ApparentPowersController(ApparentPowerService apparentPowerService) {
		super();
		this.apparentPowerService = apparentPowerService;
	}
	@GetMapping("/getall")
	public DataResult<List<ApparentPowerView>> viewGetAll(){
		return apparentPowerService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<ApparentPowerView> getLast(){
		return apparentPowerService.getLast();
	}
	
}
