package kodlamaio.hrms.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdDao;
import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdWithCompanyDto;

@Service
public class JobAdManager implements JobAdService{

	private JobAdDao jobAdDao;
	
	@Autowired
	public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}
	
	@Override
	public DataResult<List<JobAdWithCompanyDto>> getByIsActive() {
		return new SuccessDataResult<List<JobAdWithCompanyDto>>(this.jobAdDao.getByIsActive(), "Data listelendi");

	}

	@Override
	public DataResult<List<JobAdWithCompanyDto>> getByJobPosting(Date jobPosting) {
		return new SuccessDataResult<List<JobAdWithCompanyDto>>(this.jobAdDao.getByJobPosting(jobPosting), "Data listelendi");

	}

	@Override
	public DataResult<List<JobAdWithCompanyDto>> getByCompanyName(String companyName) {
		
		return new SuccessDataResult<List<JobAdWithCompanyDto>>(this.jobAdDao.getByCompanyName(companyName), "Data listelendi");

	}

	@Override
	public Result setPassiveByJobAdId(int jobAdId) {
		JobAd jobAd= this.jobAdDao.findById(jobAdId).get();
		jobAd.setActive(false);
		this.jobAdDao.save(jobAd);
		return new SuccessResult("İş ilanı kapatıldı");
	}
	
	

/*	@Override
	public DataResult<JobAd> getByJobAdId(int jobAdId) {
		return new SuccessDataResult<JobAd>(this.jobAdDao.getByJobAdId(jobAdId), "Data listelendi");
	}
	
	@Override
	public DataResult<List<JobAdWithProviderDto>> getByTest(String test) {
		return new SuccessDataResult<List<JobAdWithProviderDto>>(this.jobAdDao.getByTest(test), "Data listelendi");
	}*/

}
