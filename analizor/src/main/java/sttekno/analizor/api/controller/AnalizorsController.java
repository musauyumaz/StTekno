package sttekno.analizor.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sttekno.analizor.business.abstracts.AnalizorService;
import sttekno.analizor.core.utilites.results.DataResult;
import sttekno.analizor.core.utilites.results.Result;
import sttekno.analizor.entities.Analizor;

@RestController
@RequestMapping("/api/analizors")
public class AnalizorsController {
	private AnalizorService analizorService;

	@Autowired
	public AnalizorsController(AnalizorService analizorService) {
		super();
		this.analizorService = analizorService;
	}
	@GetMapping("/getall")
	public DataResult<List<Analizor>> getAll(){
		return analizorService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Analizor analizor) {
		return analizorService.add(analizor);
	}
	
}
