package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.ReactivePowerService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.entities.views.ReactivePowerView;

@RestController
@RequestMapping("/api/reactivepowers")
public class ReactivePowersController {
	private ReactivePowerService reactivePowerService;
	
	@Autowired
	public ReactivePowersController(ReactivePowerService reactivePowerService) {
		super();
		this.reactivePowerService = reactivePowerService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<ReactivePowerView>> viewGetAll(){
		return reactivePowerService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<ReactivePowerView> getLast(){
		return reactivePowerService.getLast();
	}
}
