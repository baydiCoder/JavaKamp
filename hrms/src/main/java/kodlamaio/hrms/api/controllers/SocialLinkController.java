package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SocialLinkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SocialLink;

@RestController
@RequestMapping("/api/sociallink")
public class SocialLinkController {

	private SocialLinkService SocialLinkService;

	@Autowired
	public SocialLinkController(SocialLinkService SocialLinkService) {
		super();
		this.SocialLinkService = SocialLinkService;
	}

	@GetMapping("/getByCandidateCvId")
	public DataResult<List<SocialLink>> getByCandidateCvId(int candidateCvId) {
		return this.SocialLinkService.getByCandidateCvId(candidateCvId);
	}

	@PostMapping("/addSocialLink")
	public void addSocialLink(@RequestBody SocialLink SocialLink) {
		this.SocialLinkService.addSocialLink(SocialLink);
	}
}
