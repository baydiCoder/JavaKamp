package onlineMall.core;

import onlineMall.entities.concretes.SignInUser;
import onlineMall.mails.gmailManager;

public class GmailAdapter  implements MailService{

	@Override
	public boolean signIn(SignInUser signInUser) {
		gmailManager gmail= new gmailManager();
		return gmail.login(signInUser.getEmail(), signInUser.getPassword());
	}

}
