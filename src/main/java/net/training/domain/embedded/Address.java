package net.training.domain.embedded;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

	@Column(name = "street")
	private String street;
	
	@Column(name = "house")
	private int house;
	
	@Column(name = "flat")
	private int flat;
}
