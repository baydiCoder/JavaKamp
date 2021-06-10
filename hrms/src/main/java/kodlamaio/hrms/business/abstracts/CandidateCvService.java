package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CandidateCv;

public interface CandidateCvService {

	void addCandidateCv(CandidateCv candidateCv);
	
	DataResult<CandidateCv> getCandidateCv(int candidateId);
}
