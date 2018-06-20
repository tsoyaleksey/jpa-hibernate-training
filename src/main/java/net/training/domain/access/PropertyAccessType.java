package net.training.domain.access;

import lombok.Data;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Access(AccessType.PROPERTY)
@Table(name = "PROPERTY_ACCESS_TYPE")
public class PropertyAccessType {
	
	@Column(name = "name")
	private String name;

}
