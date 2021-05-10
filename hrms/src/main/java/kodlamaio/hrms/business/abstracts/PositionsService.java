package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Positions;

public interface PositionsService {
	List<Positions> getAll();
}
