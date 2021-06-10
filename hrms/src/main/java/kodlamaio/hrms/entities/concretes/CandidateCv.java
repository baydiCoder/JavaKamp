package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="candidate_cv")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","schools","experiences","technologies","socialLinks"})
public class CandidateCv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_cv_id")
	private Integer candidateCvId;
	
	@Column(name="summary")
	private String summary;
	
	@Column(name="photo_link")
	private String photoLink;
	
	@OneToMany(mappedBy="candidateCv")
	private List<SchoolCandidate> schools;
	
	@OneToMany(mappedBy="candidateCv")
	private List<LanguageCandidate> languages;
	
	@OneToMany(mappedBy="candidateCv")
	private List<Experience> experiences;
	
	@OneToMany(mappedBy="candidateCv")
	private List<Technology> technologies;
	
	@OneToMany(mappedBy="candidateCv")
	private List<SocialLink> socialLinks;
	
}
