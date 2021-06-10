package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

	private ExperienceService experienceService;

	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

	@GetMapping("/getByCandidateCvIdSorted")
	public DataResult<List<Experience>> getByCandidateCvIdSorted(int candidateCvId) {
		return this.experienceService.getByCandidateCvIdSorted(candidateCvId);
	}

	@PostMapping("/addExperience")
	public void addExperience(@RequestBody Experience experience) {
		this.experienceService.addExperience(experience);
	}
}