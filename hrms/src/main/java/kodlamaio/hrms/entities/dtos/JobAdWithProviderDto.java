package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdWithProviderDto {
	
	public JobAdWithProviderDto(String positionName,String numberOfPostition, Date jobPosting, Date jobUnposting) {
		super();
		this.numberOfPostition = numberOfPostition;
		this.jobPosting = jobPosting;
		this.jobUnposting = jobUnposting;
		this.positionName=positionName;
	}
	private String companyName;
	private String positionName;
	private String numberOfPostition;
	private Date jobPosting;
	private Date jobUnposting;
	

}
