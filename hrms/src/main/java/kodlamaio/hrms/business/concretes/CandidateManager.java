package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.adapter.MernisServiceAdapter;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidatedao;
	private MernisServiceAdapter mernisServiceAdapter;

	@Autowired
	public CandidateManager(CandidateDao candidatedao, MernisServiceAdapter mernisServiceAdapter) {
		super();
		this.candidatedao = candidatedao;
		this.mernisServiceAdapter = mernisServiceAdapter;
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>(this.candidatedao.findAll(), "İş arayanlar listelendi.");
	}

	@Override
	public Result addCandidate(Candidates candidate) {
		try {
			boolean checkPerson = this.mernisServiceAdapter.checkIfRealPerson(candidate.getIdentityNumber(),
					candidate.getFirstName(), candidate.getLastName(), candidate.getYearOfBirth());
			if (checkPerson) {
				Candidates inList = this.candidatedao.findByIdentityNumber(candidate.getIdentityNumber());
				if (inList == null ) {
					this.candidatedao.save(candidate);
				}
				else
					return new ErrorResult("HATA : Kimlik Numarası kayıtlı.");
				
			} else
				return new ErrorResult("HATA : Kimlik Doğrulama yapılamadı.");
		} catch (Exception e) {
			return new ErrorResult("HATA : " + e.toString());
		}
		return new SuccessResult("İş arayan eklendi");
	}

}
