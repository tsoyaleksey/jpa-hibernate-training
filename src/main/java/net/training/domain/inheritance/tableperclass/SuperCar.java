package net.training.domain.inheritance.tableperclass;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
public class SuperCar extends Car {

	@Column(name = "turbo_power")
	private double turboPower;
}
