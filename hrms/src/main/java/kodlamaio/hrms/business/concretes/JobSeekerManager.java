package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.adapter.MernisServiceAdapter;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private MernisServiceAdapter mernisServiceAdapter;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisServiceAdapter mernisServiceAdapter) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisServiceAdapter = mernisServiceAdapter;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi.");
	}

	@Override
	public Result addJobSeeker(JobSeeker jobSeeker) {
		try {
			boolean checkPerson = this.mernisServiceAdapter.checkIfRealPerson(jobSeeker.getIdentityNumber(),
					jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getYearOfBirth());
			if (checkPerson) {
				JobSeeker inList = this.jobSeekerDao.findByIdentityNumber(jobSeeker.getIdentityNumber());
				if (inList == null ) {
					this.jobSeekerDao.save(jobSeeker);
				}
				else
					return new ErrorResult("HATA : Kimlik Numarası kayıtlı.");
				
			} else
				return new ErrorResult("HATA : Kimlik Doğrulama yapılamadı.");
		} catch (Exception e) {
			return new ErrorResult("HATA : " + e.toString());
		}
		return new SuccessResult("İş arayan eklendi");
	}

}
