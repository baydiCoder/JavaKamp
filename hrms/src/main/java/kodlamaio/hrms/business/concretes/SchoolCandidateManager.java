package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolCandidateDao;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;

@Service
public class SchoolCandidateManager implements SchoolCandidateService{

	SchoolCandidateDao schoolCandidateDao;
	
	@Autowired
	public SchoolCandidateManager(SchoolCandidateDao schoolCandidateDao) {
		super();
		this.schoolCandidateDao = schoolCandidateDao;
	}

	@Override
	public DataResult<List<SchoolCandidate>> getByCandidateCvIdSorted(int candidateCvId) {
		  return new SuccessDataResult<List<SchoolCandidate>>(this.schoolCandidateDao.getByCandidateCvIdSorted(candidateCvId), "Başarılı");
			
	}


	@Override
	public void addSchoolCandidate(SchoolCandidate schoolCandidate) {
		this.schoolCandidateDao.save(schoolCandidate);
	}

}
