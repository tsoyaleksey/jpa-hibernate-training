package net.training.domain.relationship.onetomany;

import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Kid extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "daddy")
	private Daddy daddy;

}
