package net.training.domain.inheritance.singletable;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CAR")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "car_type")
public class Car extends BaseEntity {

	@Column(name = "name")
	private String model;
	
	@Column(name = "max_speed")
	private int maxSpeed;
	
	@Column(name = "producer")
	private String producer;
	
}
