package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobProvider;

public interface JobProviderService {
	DataResult<List<JobProvider>> getAll();

	void insert(JobProvider jobProvider,String email);
}
