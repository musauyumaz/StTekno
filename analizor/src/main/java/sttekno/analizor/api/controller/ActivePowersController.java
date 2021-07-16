package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.ActivePowerService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.ActivePowerView;


@RestController
@RequestMapping("/api/activepowercontroller")
public class ActivePowersController {
	private ActivePowerService activePowerService;
	@Autowired
	public ActivePowersController(ActivePowerService activePowerService) {
		super();
		this.activePowerService = activePowerService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<ActivePowerView>> viewGetAll(){
		return activePowerService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<ActivePowerView> getLast(){
		return activePowerService.getLast();
	}

}
