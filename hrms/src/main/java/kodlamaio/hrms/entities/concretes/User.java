package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	@Getter
	@Setter
	private Integer UserId;

	@Column(name = "mail")
	@Getter
	@Setter
	private String Mail;

	@Column(name = "password")
	@Getter
	@Setter
	private String Password;

	@Column(name = "re_password")
	@Getter
	@Setter
	private String RePassword;

	@Column(name = "verify_mail")
	@Getter
	@Setter
	private Boolean VerifyMail;
	

	public User(Integer userId, String mail, String password, String rePassword, Boolean verifyMail) {
		super();
		UserId = userId;
		Mail = mail;
		Password = password;
		RePassword = rePassword;
		VerifyMail = verifyMail;
	}

}
