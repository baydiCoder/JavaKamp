package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCvService;
import kodlamaio.hrms.core.abstracts.ImageUploadService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateCvDao;
import kodlamaio.hrms.entities.concretes.CandidateCv;

@Service
public class CandidateCvManager implements CandidateCvService{
	
	CandidateCvDao candidateCvDao;
	ImageUploadService imageUploadService;

	@Autowired
	public CandidateCvManager(CandidateCvDao candidateCvDao,ImageUploadService imageUploadService) {
		super();
		this.candidateCvDao = candidateCvDao;
		this.imageUploadService=imageUploadService;
	}

	@Override
	public void addCandidateCv(CandidateCv candidateCv) {
		String path=imageUploadService.imageUpload(candidateCv.getPhotoLink());
		candidateCv.setPhotoLink(path);
		candidateCvDao.save(candidateCv);
	}

	@Override
	public DataResult<CandidateCv> getCandidateCv(int candidateId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
