package net.training.domain.relationship.onetoone;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class Husband extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "wife")
	private Wife wife;

}
