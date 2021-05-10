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
@Data
@Table(name="job_seekers")
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class JobSeeker extends User{
	

	@Column(name="name")
	@Getter
	@Setter
	private String Name;
	
	@Column(name="surname")
	@Getter
	@Setter
	private String Surname;
	
	@Column(name="identity_number")
	@Getter
	@Setter
	private String IdentityNumber;
	
	@Column(name="year_of_birth")
	@Getter
	@Setter
	private Integer YearOfBirth;

}
