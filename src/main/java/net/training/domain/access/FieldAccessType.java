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
@Table(name = "FIELD_ACCESS_TYPE")
@Access(AccessType.FIELD) //using by default
public class FieldAccessType extends BaseEntity {

	@Column(name = "name")
	private String name;
}
