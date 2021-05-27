package kodlamaio.hrms.core.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.abstracts.UserCheckService;
@Service
public class MernisServiceAdapter implements UserCheckService {
	
	@Autowired
	public MernisServiceAdapter() {
		super();
			}
	
	@Override
	public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, String yearOfBirth) {

		// KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result = false;

		try {
			if (Integer.parseInt(yearOfBirth) < 2000)
				result = true;
			else
				result = false;
			/*
			 * result= client.TCKimlikNoDogrula(Long.parseLong(user.getnationalityId()),
			 * user.getfirstName().toUpperCase(), user.getlastName().toUpperCase(),// 1987
			 * user.getdateOfBirth().getYear()
			 * //customer.getdateOfBirth().toInstant().atZone(ZoneId.systemDefault()).
			 * toLocalDate().getYear() );
			 */
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Kimlik doğrulama : " + (result ? "başarılı" : "başarısız"));
		return result;
	}
}
