package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="social_link")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidateCv"})
public class SocialLink {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="social_link_id")
	private Integer socialLinkId;
	
	@Column(name="link")
	private String link;
	
	@ManyToOne
	@JoinColumn(name="candidate_cv_id")
	private CandidateCv candidateCv;
}
