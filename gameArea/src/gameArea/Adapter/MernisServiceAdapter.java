package gameArea.Adapter;

import java.time.ZoneId;

import gameArea.Abstract.*;
import gameArea.Entities.*;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements UserCheckService {
	public boolean checkIfRealPerson(User user) {

		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			
			result=true;
		/*result= client.TCKimlikNoDogrula(Long.parseLong(user.getnationalityId()),
				user.getfirstName().toUpperCase(),
				user.getlastName().toUpperCase(),// 1987
				user.getdateOfBirth().getYear()
				//customer.getdateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				);
				*/
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Kimlik doğrulama : "+(result?"başarılı":"başarısız"));
		return result;
	}
}
