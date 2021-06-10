package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialLinkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialLinkDao;
import kodlamaio.hrms.entities.concretes.SocialLink;

@Service
public class SocialLinkManager implements SocialLinkService {

	private SocialLinkDao socialLinkDao;

	@Autowired
	public SocialLinkManager(SocialLinkDao socialLinkDao) {
		super();
		this.socialLinkDao = socialLinkDao;
	}

	@Override
	public void addSocialLink(SocialLink socialLink) {
		this.socialLinkDao.save(socialLink);

	}

	@Override
	public void addSocialLinkBulk(List<SocialLink> socialLinks) {

		for (SocialLink socialLink : socialLinks) {
			this.socialLinkDao.save(socialLink);
		}

	}

	@Override
	public DataResult<List<SocialLink>> getByCandidateCvId(int candidateCvId) {
		return new SuccessDataResult<List<SocialLink>>(this.socialLinkDao.getByCandidateCvId(candidateCvId), "Başarılı");
	}

}
