package kodlamaio.hrms.dataAccess.abstracts;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdWithProviderDto;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {
	
	/*JobAd getByJobAdId(int jobAdId);
	
	 @Query("Select new kodlamaio.hrms.entities.dtos.JobAdWithProviderDto"
		  		+"(jpr.companyName,jpos.positionName,ja.numberOfPosition,ja.jobPosting,ja.jobUnposting) "
		  		+ "From JobAd ja "
		  		+ "Inner Join ja.jobPosition jpos "
		  		+ "Inner Join ja.jobProvider jpr "
		  		+ "Where ja.numberOfPosition=:test")
	List<JobAdWithProviderDto> getByTest(String test);*/
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdWithProviderDto"
	  		+"(jpr.companyName,jpos.positionName,ja.numberOfPosition,ja.jobPosting,ja.jobUnposting) "
	  		+ "From JobAd ja "
	  		+ "Inner Join ja.jobPosition jpos "
	  		+ "Inner Join ja.jobProvider jpr "
			+ "Where ja.isActive='true'")
	List<JobAdWithProviderDto> getByIsActive();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdWithProviderDto"
	  		+"(jpr.companyName,jpos.positionName,ja.numberOfPosition,ja.jobPosting,ja.jobUnposting) "
	  		+ "From JobAd ja "
	  		+ "Inner Join ja.jobPosition jpos "
	  		+ "Inner Join ja.jobProvider jpr "
			+ "Where ja.jobPosting=:jobPosting")
	List<JobAdWithProviderDto> getByJobPosting(Date jobPosting);
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdWithProviderDto"
	  		+"(jpr.companyName,jpos.positionName,ja.numberOfPosition,ja.jobPosting,ja.jobUnposting) "
	  		+ "From JobAd ja "
	  		+ "Inner Join ja.jobPosition jpos "
	  		+ "Inner Join ja.jobProvider jpr "
			+ "Where jpr.companyName =:companyName")
	List<JobAdWithProviderDto> getByCompanyName(String companyName);
	
}