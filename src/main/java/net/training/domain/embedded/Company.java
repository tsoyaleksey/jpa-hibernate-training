package net.training.domain.embedded;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "COMPANY")
public class Company extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@Embedded
	private Address address;

}
