package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidateDao extends JpaRepository<Candidates,Integer> {
	Candidates findByIdentityNumber(String identityNumber);
}
