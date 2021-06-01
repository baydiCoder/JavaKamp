package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Inheritance(strategy=InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","user"})
@Table(name="job_seekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_seeker_id")
	private Integer jobSeekerId;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="year_of_birth")
	private String yearOfBirth;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

}
