package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerController {

	private JobSeekerService jobSeekerService;
	

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService)
	{	this.jobSeekerService = jobSeekerService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getall()
	{
		return this.jobSeekerService.getAll();
	}
	
	@PostMapping("/addjobseeker")
	public void addJobSeeker(@RequestBody JobSeeker jobSeeker)
	{
		this.jobSeekerService.addJobSeeker(jobSeeker);
	}
	
}