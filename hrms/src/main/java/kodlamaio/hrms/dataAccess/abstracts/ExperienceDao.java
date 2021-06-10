package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer>{

	@Query("From Experience where candidateCv.candidateCvId=:candidateCvId order by endDate desc")
	List<Experience> getByCandidateCvIdSorted(int candidateCvId);
	
}
