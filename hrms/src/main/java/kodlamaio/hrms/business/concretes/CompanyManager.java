package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{

	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>>getAll() {
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"İş verenler listelendi.");
	}
	
	
	@Override
	public void insert(Company company,String email) {
		
		String webCheck = company.getWebAddress().substring(company.getWebAddress().indexOf("www.")+4).toLowerCase();
		String emailCheck = company.getWebAddress().substring(company.getWebAddress().indexOf("@")+1).toLowerCase();
		
		if (!webCheck.equals(emailCheck)) {
			System.out.println("Firmaya ait mail adresi giriniz.");
			return;
		}

		this.companyDao.save(company);
	}

}
