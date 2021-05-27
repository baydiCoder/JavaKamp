package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobProviderService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobProvider;

@RestController
@RequestMapping("/api/jobprovider")
public class JobProviderController {

	private JobProviderService jobProviderService;

	@Autowired
	public JobProviderController(JobProviderService jobProviderService) {
		super();
		this.jobProviderService = jobProviderService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobProvider>> getall()
	{
		return this.jobProviderService.getAll();
	}
	
	
}
