package kodlamaio.hrms.business.abstracts;


import java.util.Date;
import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.JobAdWithCompanyDto;

public interface JobAdService {
	DataResult<List<JobAdWithCompanyDto>> getByIsActive();
	
	DataResult<List<JobAdWithCompanyDto>> getByJobPosting(Date jobPosting);
	
	DataResult<List<JobAdWithCompanyDto>> getByCompanyName(String companyName);
	
	Result setPassiveByJobAdId(int jobAdId);
	
/*	DataResult<JobAd> getByJobAdId(int cityId);
	
	DataResult<List<JobAdWithProviderDto>> getByTest(String test);*/
}
