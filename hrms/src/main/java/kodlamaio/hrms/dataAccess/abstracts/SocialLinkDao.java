package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.SocialLink;

public interface SocialLinkDao extends JpaRepository<SocialLink,Integer> {
	
	@Query("From SocialLink where candidateCv.candidateCvId=:candidateCvId")
	List<SocialLink> getByCandidateCvId(int candidateCvId);
}
