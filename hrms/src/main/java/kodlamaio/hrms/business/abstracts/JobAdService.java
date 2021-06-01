package kodlamaio.hrms.business.abstracts;


import java.util.Date;
import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.JobAdWithProviderDto;

public interface JobAdService {
	DataResult<List<JobAdWithProviderDto>> getByIsActive();
	
	DataResult<List<JobAdWithProviderDto>> getByJobPosting(Date jobPosting);
	
	DataResult<List<JobAdWithProviderDto>> getByCompanyName(String companyName);
	
	Result setPassiveByJobAdId(int jobAdId);
	
/*	DataResult<JobAd> getByJobAdId(int cityId);
	
	DataResult<List<JobAdWithProviderDto>> getByTest(String test);*/
}
