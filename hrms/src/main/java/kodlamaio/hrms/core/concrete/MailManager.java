package kodlamaio.hrms.core.concrete;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.abstracts.MailService;


@Service
public class MailManager implements MailService{

	@Override
	public boolean sendMail(String email, String detail) {
		System.out.println(email+" adresine '"+detail+"' içerikli mail gönderildi");
		return true;
	}

}
