package kodlamaio.hrms.core.abstracts;

public interface UserCheckService {
	boolean checkIfRealPerson(String identityNumber,String firstName,String lastName,String yearOfBirth) ;
}
