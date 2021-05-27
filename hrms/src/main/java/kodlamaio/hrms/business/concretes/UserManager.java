package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.abstracts.MailService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	private MailService mailService;

	@Autowired
	public UserManager(UserDao userDao, MailService mailService) {
		this.userDao = userDao;
		this.mailService = mailService;
	}

	@Override
	public DataResult<List<User>> getAll() {

		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanıcılar listelendi.");

	}

	@Override
	public void insert(User user) {
		boolean check = true;
		
		check = validMailPattern(user.getMail()) ? true : false;
		if (!check) {
			System.out.println("Geçerli mail adresi giriniz.");
			return;
		}
		
		check = IsEmailNotExist(user.getMail()) ? true : false;
		if (!check) {
			System.out.println("Bu mail adresi kayıtlı.");
			return;
		}

		check = user.getPassword() == user.getRepassword() ? true : false;
		if (!check) {
			System.out.println("Şifreler uymuyor.");
			return;
		}

		this.userDao.save(user);

		mailService.sendMail(user.getMail(), "Mail adresinizi doğrulamak için lütfen tıklayınız.");
	}

	@Override
	public void VerifyMail(User user) {
		user.setVerifyMail(true);
		this.userDao.save(user);
		System.out.println("Email doğrulandı.");

	}

	private boolean validMailPattern(String value) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9\\_\\.\\-]+[@][a-z]+[.][a-z]{3}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.find()) {
			return true;
		}
		System.out.println("Hata : Geçerli mail adresi giriniz");
		return false;
	}

	private boolean IsEmailNotExist(String email) {

		if (this.userDao.findByMail(email).isEmpty())
			return true;
		return false;

	}

}
