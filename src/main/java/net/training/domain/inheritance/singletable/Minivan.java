package net.training.domain.inheritance.singletable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(value = "minivan")
public class Minivan extends Car {
	
	@Column(name = "seat")
	private int seat;

}
