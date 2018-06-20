package net.training.domain.inheritance.tableperclass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
public class Minivan extends Car {
	
	@Column(name = "seat")
	private int seat;

}
