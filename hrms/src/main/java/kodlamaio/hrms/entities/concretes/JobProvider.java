package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_providers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAds","user"})
//@Inheritance(strategy=InheritanceType.JOINED)
public class JobProvider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_provider_id")
	private Integer jobProviderId;

	@Column(name="company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAddress;
	
	@Column(name = "phone")
	private String phone;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="jobProvider")
	private List<JobAd> jobAds;
	
}
