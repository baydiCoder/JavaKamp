package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologyDao;
import kodlamaio.hrms.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyDao technologyDao;

	@Autowired
	public TechnologyManager(TechnologyDao technologyDao) {
		super();
		this.technologyDao = technologyDao;
	}

	@Override
	public void addTechnology(Technology technology) {
		this.technologyDao.save(technology);

	}

	@Override
	public void addTechnologyBulk(List<Technology> technologies) {

		for (Technology technology : technologies) {
			this.technologyDao.save(technology);
		}

	}

	@Override
	public DataResult<List<Technology>> getByCandidateCvId(int candidateCvId) {
		return new SuccessDataResult<List<Technology>>(this.technologyDao.getByCandidateCvId(candidateCvId), "Başarılı");

	}

}
