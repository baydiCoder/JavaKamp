package onlineMall.business.concretes;

import onlineMall.business.abstracts.*;
import onlineMall.core.MailService;
import onlineMall.entities.concretes.SignInUser;

public class SignInManager implements SignInService {

	private UserService _userService;
	private MailService _mailService;

	public SignInManager(UserService userService) {
		this._userService = userService;
	}
	
	public SignInManager(MailService mailService) {
		this._mailService = mailService;
	}

	@Override
	public void signInLocal(SignInUser signInUser) {

		if ((signInUser.getEmail() != null) && (signInUser.getPassword() != null)) {
			if (_userService.SignInUserExist(signInUser)) {
				System.out.println("Giriş başarılı");
				return;
			}
		}
		System.out.println("Kullanıcı kayıtlı değil");

	}

	@Override
	public void signInAdapter(SignInUser signInUser) {
		_mailService.signIn(signInUser);
	}

}
