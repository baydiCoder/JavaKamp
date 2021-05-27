package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobProvider;

public interface JobProviderDao extends JpaRepository<JobProvider,Integer> {

}
