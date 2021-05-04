package coffeeShop.Adapter;

import java.time.ZoneId;

import coffeeShop.Abstract.*;
import coffeeShop.Entities.*;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
		result= client.TCKimlikNoDogrula(Long.parseLong(customer.getnationalityId()),
				customer.getfirstName().toUpperCase(),
				customer.getlastName().toUpperCase(),// 1987
				customer.getdateOfBirth().getYear()
				//customer.getdateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println(result?"başarılı":"başarısız");
		return result;
	}
}
