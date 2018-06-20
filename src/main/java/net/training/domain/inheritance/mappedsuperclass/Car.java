package net.training.domain.inheritance.mappedsuperclass;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Car extends BaseEntity {

	@Column(name = "name")
	private String model;
	
	@Column(name = "max_speed")
	private int maxSpeed;
	
	@Column(name = "producer")
	private String producer;
	
}
