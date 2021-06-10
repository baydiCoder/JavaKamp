package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageCandidateDao;
import kodlamaio.hrms.entities.concretes.LanguageCandidate;

@Service
public class LanguageCandidateManager implements LanguageCandidateService {

	private LanguageCandidateDao languageCandidateDao;

	@Autowired
	public LanguageCandidateManager(LanguageCandidateDao languageCandidateDao) {
		super();
		this.languageCandidateDao = languageCandidateDao;
	}

	@Override
	public void addLanguage(LanguageCandidate languageCandidate) {
		this.languageCandidateDao.save(languageCandidate);

	}

	@Override
	public void addLanguageBulk(List<LanguageCandidate> languageCandidates) {

		for (LanguageCandidate languageCandidate : languageCandidates) {
			this.languageCandidateDao.save(languageCandidate);
		}

	}

	@Override
	public DataResult<List<LanguageCandidate>> getByCandidateCvId(int candidateCvId) {
		return new SuccessDataResult<List<LanguageCandidate>>(this.languageCandidateDao.getByCandidateCvId(candidateCvId), "Başarılı");
	}

}
