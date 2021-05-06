package onlineMall.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import onlineMall.business.abstracts.UserService;
import onlineMall.dataAccess.abstracts.UserDao;
import onlineMall.entities.concretes.SignInUser;
import onlineMall.entities.concretes.User;

public class UserManager implements UserService {

	List<User> _allUser;
	UserDao _userDao;

	public UserManager(UserDao userDao) {
		super();
		this._userDao = userDao;
		_allUser = new ArrayList<>();
	}

	@Override
	public boolean validUser(User user) {

		return validName(user.getFirstName()) & validName(user.getLastName()) & validEmail(user.getEmail())
				& validPassword(user.getPassword());

	}

	private boolean validName(String value) {

		if (value != null) {
			if (value.length() > 2) {
				return true;
			}
		}
		System.out.println("Hata : Geçerli isim soyisim bilgisi giriniz.");
		return false;
		// throw new Exception("Geçerli isim soyisim bilgisi giriniz. ");

	}

	private boolean validEmail(String value) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9\\_\\.\\-]+[@][a-z]+[.][a-z]{3}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.find()) {
			return true;
		}
		System.out.println("Hata : Geçerli mail adresi giriniz");
		return false;
		// throw new Exception("Geçerli mail adresi giriniz. ");

	}

	private boolean validPassword(String value) {

		if (value.length() > 5) {
			return true;
		}
		System.out.println("Hata : Şifreniz en az 6 karakterden oluşmalıdır.");
		return false;

		// throw new Exception("Şifreniz en az 6 karakterden oluşmalıdır. ");

	}

	@Override
	public boolean SignUpUser(User user) {

		boolean resultUser = validUser(user);
		if (resultUser) {
			boolean result = IsEmailNotExist(user.getEmail());

			if (result) {
				_allUser.add(user);
				_userDao.add(user);
				System.out.println("Uyarı : Email Doğrulama için mail gönderildi");
				return true;
			}
			System.out.println("Hata : Email adresi sistemde kayıtlıdır.");
			return false;
		}
		return false;
		// throw new Exception("Email adresi sistemde kayıtlıdır. ");
	}

	private boolean IsEmailNotExist(String email) {

		if (!_allUser.stream().anyMatch(a -> a.getEmail().equals(email)))
			return true;

		return false;

	}

	@Override
	public void VerifyMail(User user) {
		user.setVerifyMail();
		System.out.println("Email doğrulandı.");

	}

	@Override
	public boolean SignInUserExist(SignInUser signInUser) {

		User user = _allUser.stream().filter((a) -> a.getEmail() == signInUser.getEmail()).findFirst().orElse(null);
		if (user != null) {
			return user.getPassword().equals(signInUser.getPassword()) ? true : false;
		}

		return false;

	}
}
