package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Positions;

public interface PositionsDao extends JpaRepository<Positions,Integer>{

}
