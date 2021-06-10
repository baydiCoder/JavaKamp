package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdWithCompanyDto {
	
	private String companyName;
	private String positionName;
	private String numberOfPostition;
	private Date jobPosting;
	private Date jobUnposting;
	

}
