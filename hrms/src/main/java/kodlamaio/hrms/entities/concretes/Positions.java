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
@Table(name = "positions")
@Data
@RequiredArgsConstructor
public class Positions {
	
	@Id
	@GeneratedValue
	@Column(name = "position_id")
	@Getter
	@Setter
	private Integer PositionId;
	
	@Column(name = "name")
	@Getter
	@Setter
	private String Name;

	public Positions(Integer positionId, String name) {
		super();
		PositionId = positionId;
		Name = name;
	}

}
