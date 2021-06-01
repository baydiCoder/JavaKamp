package kodlamaio.hrms.api.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdWithProviderDto;

@RestController
@RequestMapping("/api/jobAds")
public class JobAdController {

	private JobAdService jobAdService;

	@Autowired
	public JobAdController(JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	
	@GetMapping("/getByIsActive")
	public 	DataResult<List<JobAdWithProviderDto>> getByIsActive()
	{
		return this.jobAdService.getByIsActive();
	}
	
	@PostMapping("/getByJobPosting")
	public 	DataResult<List<JobAdWithProviderDto>> getByJobPosting(@RequestParam Date jobPosting)
	{
		return this.jobAdService.getByJobPosting(jobPosting);
	}
	
	@PostMapping("/getByCompanyName")
	public 	DataResult<List<JobAdWithProviderDto>> getByCompanyName(@RequestParam String companyName)
	{
		return this.jobAdService.getByCompanyName(companyName);
	}
	
	@PostMapping("/setPassiveByJobAdId")
	public 	Result setPassiveByJobAdId(@RequestParam int jobAdId)
	{
		return this.jobAdService.setPassiveByJobAdId(jobAdId);
	}
	
	/*@PostMapping("/getByJobAdId")
	public 	DataResult<JobAd> getByJobAdId(@RequestParam int jobAdId)
	{
		return this.jobAdService.getByJobAdId(jobAdId);
	}
	
	@PostMapping("/getByTest")
	public 	DataResult<List<JobAdWithProviderDto>> getByTest(@RequestParam String test)
	{
		return this.jobAdService.getByTest(test);
	}*/

}
