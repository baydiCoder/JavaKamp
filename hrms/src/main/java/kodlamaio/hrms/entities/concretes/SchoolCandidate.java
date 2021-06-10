package kodlamaio.hrms.entities.concretes;

import java.util.Date;

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
@Table(name="school_candidate")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidateCv","school","department"})
public class SchoolCandidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="school_candidate_id")
	private Integer schoolCandidateId;
	
	@Column(name="enrol_date")
	private Date enrolDate;
	
	@Column(name="graduate_date")
	private Date graduateDate;
	
	@ManyToOne
	@JoinColumn(name="candidate_cv_id")
	private CandidateCv candidateCv;
	
	@ManyToOne
	@JoinColumn(name="school_id")
	private School school;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
}
