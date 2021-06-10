package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.SchoolCandidate;

public interface SchoolCandidateDao extends JpaRepository<SchoolCandidate,Integer> {
	
	@Query("From SchoolCandidate where candidateCv.candidateCvId=:candidateCvId order by end_date desc")
	List<SchoolCandidate> getByCandidateCvIdSorted(int candidateCvId);
	
}
