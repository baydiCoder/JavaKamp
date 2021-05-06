package onlineMall.mails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gmailManager {
	public boolean login(String mail,String password) {
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9\\_\\.\\-]+@gmail[.]com");
		Matcher matcher = pattern.matcher(mail);
		if (matcher.find()) {
			System.out.println("Gmail giriş başarılı");
			return true;
		}
		System.out.println("Hata : Geçerli gmail adresi giriniz");
		return false;
	}
}
