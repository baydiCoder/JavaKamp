package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobProviderService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobProviderDao;
import kodlamaio.hrms.entities.concretes.JobProvider;

@Service
public class JobProviderManager implements JobProviderService{

	private JobProviderDao jobProviderDao;
	
	@Autowired
	public JobProviderManager(JobProviderDao jobProviderDao) {
		this.jobProviderDao = jobProviderDao;
	}

	@Override
	public DataResult<List<JobProvider>>getAll() {
		return new SuccessDataResult<List<JobProvider>>(this.jobProviderDao.findAll(),"İş verenler listelendi.");
	}
	
	
	@Override
	public void insert(JobProvider jobProvider,String email) {
		
		String webCheck = jobProvider.getWebAddress().substring(jobProvider.getWebAddress().indexOf("www.")+4).toLowerCase();
		String emailCheck = jobProvider.getWebAddress().substring(jobProvider.getWebAddress().indexOf("@")+1).toLowerCase();
		
		if (!webCheck.equals(emailCheck)) {
			System.out.println("Firmaya ait mail adresi giriniz.");
			return;
		}

		this.jobProviderDao.save(jobProvider);
	}

}
