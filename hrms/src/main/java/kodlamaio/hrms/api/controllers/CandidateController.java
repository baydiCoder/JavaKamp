package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

	private CandidateService candidateService;
	

	@Autowired
	public CandidateController(CandidateService candidateService)
	{	this.candidateService = candidateService;
		
	}
	
	public DataResult<List<Candidates>> getAll()
	{
		return this.candidateService.getAll();
	}
	
	@PostMapping("/addcandidate")
	public void addCandidate(@RequestBody Candidates candidate)
	{
		this.candidateService.addCandidate(candidate);
	}
	
}