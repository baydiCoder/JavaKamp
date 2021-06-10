package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Experience;

public interface ExperienceService {
	DataResult<List<Experience>> getByCandidateCvIdSorted(int candidateCvId);

	void addExperience(Experience experience);
}
