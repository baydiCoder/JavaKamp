package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SocialLink;

public interface SocialLinkService {
	void addSocialLink(SocialLink socialLink);
	
	void addSocialLinkBulk(List<SocialLink> socialLinks);
	
	DataResult<List<SocialLink>> getByCandidateCvId(int candidateCvId);
}
