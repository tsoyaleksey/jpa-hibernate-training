package net.training.domain.access;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "MIXED_ACCESS_TYPE")
@Access(AccessType.FIELD)
public class MixedAccessType extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	@Access(AccessType.PROPERTY)
	private String description;

}
