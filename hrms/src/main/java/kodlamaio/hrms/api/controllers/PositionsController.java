package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.PositionsService;
import kodlamaio.hrms.entities.concretes.Positions;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {

	private PositionsService positionsService;

	@Autowired
	public PositionsController(PositionsService positionsService) {
		super();
		this.positionsService = positionsService;
	}
	
	@GetMapping("/getall")
	public List<Positions> getall()
	{
		return this.positionsService.getAll();
	}
	
}
