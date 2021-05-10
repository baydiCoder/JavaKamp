package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PositionsService;
import kodlamaio.hrms.dataAccess.abstracts.PositionsDao;
import kodlamaio.hrms.entities.concretes.Positions;

@Service
public class PositionsManager implements PositionsService{

	private PositionsDao positionDao;
	
	@Autowired
	public PositionsManager(PositionsDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	
	@Override
	public List<Positions> getAll() {
		return this.positionDao.findAll();
	}

}
