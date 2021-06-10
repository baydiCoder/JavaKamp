package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Technology;

public interface TechnologyService {
	void addTechnology(Technology technology);
	
	void addTechnologyBulk(List<Technology> technologies);
	
	DataResult<List<Technology>> getByCandidateCvId(int candidateCvId);
}
