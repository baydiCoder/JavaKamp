package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job_providers")
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class JobProvider  extends User{

	@Column(name = "web_address")
	@Getter
	@Setter
	private String WebAddress;
	
	@Column(name = "phone")
	@Getter
	@Setter
	private String Phone;

	public JobProvider(Integer userId, String mail, String password, String rePassword, Boolean verifyMail,
		 String webAddress, String phone) {
		super(userId, mail, password, rePassword, verifyMail);
		WebAddress = webAddress;
		Phone = phone;
	}
}
