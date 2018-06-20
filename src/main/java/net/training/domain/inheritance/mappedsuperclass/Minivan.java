package net.training.domain.inheritance.mappedsuperclass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Minivan extends Car {
	
	@Column(name = "seat")
	private int seat;

}
