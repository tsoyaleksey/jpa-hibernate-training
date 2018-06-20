package net.training.domain.relationship.onetoone;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
public class Wife extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(mappedBy = "wife")
	private Husband husband;

}
