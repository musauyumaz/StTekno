package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.LineVoltageService;
import sttekno.analizor.core.utilites.results.DataResult;

import sttekno.analizor.entities.views.LineVoltageView;

@RestController
@RequestMapping("/api/linevoltages")
public class LineVoltagesController {
	private LineVoltageService lineVoltageService;
	@Autowired
	public LineVoltagesController(LineVoltageService lineVoltageService) {
		super();
		this.lineVoltageService = lineVoltageService;
	}
	@GetMapping("/viewgetall")
	public DataResult<List<LineVoltageView>> viewGetAll(){
		return lineVoltageService.viewGetAll();
	}
	@GetMapping("/getlast")
	public DataResult<LineVoltageView> getLast(){
		return lineVoltageService.getLast();
	}
}
