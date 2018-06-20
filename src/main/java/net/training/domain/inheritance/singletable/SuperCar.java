package net.training.domain.inheritance.singletable;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(value = "sport")
public class SuperCar extends Car {

	@Column(name = "turbo_power")
	private double turboPower;
}
