package onlineMall.business.abstracts;

import onlineMall.entities.concretes.SignInUser;
import onlineMall.entities.concretes.User;

public interface UserService {
	boolean validUser(User user) throws Exception;

	void VerifyMail(User user);

	boolean SignInUserExist(SignInUser signInUser);

	boolean SignUpUser(User user) ;//throws Exception;
}
