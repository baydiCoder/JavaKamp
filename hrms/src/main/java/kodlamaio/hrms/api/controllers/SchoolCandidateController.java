package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;

@RestController
@RequestMapping("/api/schoolcandidate")
public class SchoolCandidateController {

	private SchoolCandidateService schoolCandidateService;

	@Autowired
	public SchoolCandidateController(SchoolCandidateService schoolCandidateService) {
		super();
		this.schoolCandidateService = schoolCandidateService;
	}

	@GetMapping("/getByCandidateCvIdSorted")
	public DataResult<List<SchoolCandidate>> getByCandidateCvIdSorted(int candidateCvId) {
		return this.schoolCandidateService.getByCandidateCvIdSorted(candidateCvId);
	}

	@PostMapping("/addSchoolCandidate")
	public void addSchoolCandidate(@RequestBody SchoolCandidate schoolCandidate) {
		this.schoolCandidateService.addSchoolCandidate(schoolCandidate);
	}
}