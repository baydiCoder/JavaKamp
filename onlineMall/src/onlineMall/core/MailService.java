package onlineMall.core;

import onlineMall.entities.concretes.SignInUser;

public interface MailService {
	boolean signIn(SignInUser signInUser);
}
