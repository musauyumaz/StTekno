package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.CurrentService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.CurrentView;

@RestController
@RequestMapping("/api/currents")
public class CurrentsController {
	private CurrentService currentService;
	@Autowired
	public CurrentsController(CurrentService currentService) {
		super();
		this.currentService = currentService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<CurrentView>> viewGetAll(){
		return currentService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<CurrentView> getLast(){
		return currentService.getLast();
	}
}
