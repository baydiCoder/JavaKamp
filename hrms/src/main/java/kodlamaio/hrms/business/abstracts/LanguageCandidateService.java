package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.LanguageCandidate;

public interface LanguageCandidateService {
	void addLanguage(LanguageCandidate languageCandidate);
	
	void addLanguageBulk(List<LanguageCandidate> languageCandidates);
	
	DataResult<List<LanguageCandidate>> getByCandidateCvId(int candidateCvId);
}
