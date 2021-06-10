package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.LanguageCandidate;

public interface LanguageCandidateDao extends JpaRepository<LanguageCandidate,Integer> {
	
	@Query("From LanguageCandidate where candidateCv.candidateCvId=:candidateCvId")
	List<LanguageCandidate> getByCandidateCvId(int candidateCvId);
}
