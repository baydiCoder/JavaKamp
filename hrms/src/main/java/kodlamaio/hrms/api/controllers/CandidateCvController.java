package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCvService;
import kodlamaio.hrms.entities.concretes.CandidateCv;

@RestController
@RequestMapping("/api/candidateCv")
public class CandidateCvController {

	private CandidateCvService candidateCvService;

	@Autowired
	public CandidateCvController(CandidateCvService candidateCvService) {
		super();
		this.candidateCvService = candidateCvService;
	}

	@PostMapping("/addCandidateCv")
	public void addCandidateCv(@RequestBody CandidateCv CandidateCv) {
		this.candidateCvService.addCandidateCv(CandidateCv);
	}
}
