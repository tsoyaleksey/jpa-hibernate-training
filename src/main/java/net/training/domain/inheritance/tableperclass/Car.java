package net.training.domain.inheritance.tableperclass;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CAR")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE) // we cannot use AUTO
	private long id;

	@Column(name = "name")
	private String model;
	
	@Column(name = "max_speed")
	private int maxSpeed;
	
	@Column(name = "producer")
	private String producer;
	
}
