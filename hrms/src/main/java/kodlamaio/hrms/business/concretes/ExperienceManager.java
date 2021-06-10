package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.ExperienceDao;
import kodlamaio.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experienceDao;

	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public DataResult<List<Experience>> getByCandidateCvIdSorted(int candidateCvId) {
		//Sort sort = Sort.by(Sort.Direction.DESC, "endDate");
		//return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(sort), "Başarılı");
	  return new SuccessDataResult<List<Experience>>(this.experienceDao.getByCandidateCvIdSorted(candidateCvId), "Başarılı");
	}

	@Override
	public void addExperience(Experience experience) {
		this.experienceDao.save(experience);
	}

}
