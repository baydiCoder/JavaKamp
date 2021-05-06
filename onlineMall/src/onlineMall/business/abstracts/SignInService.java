package onlineMall.business.abstracts;

import onlineMall.entities.concretes.SignInUser;

public interface SignInService {
	void signInLocal(SignInUser signInUser);
	
	void signInAdapter(SignInUser signInUser);
}
