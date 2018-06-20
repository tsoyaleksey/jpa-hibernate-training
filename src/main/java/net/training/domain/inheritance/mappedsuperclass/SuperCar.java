package net.training.domain.inheritance.mappedsuperclass;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@AttributeOverride(name = "producer", column = @Column(name = "maker"))
public class SuperCar extends Car {

	@Column(name = "turbo_power")
	private double turboPower;
}
