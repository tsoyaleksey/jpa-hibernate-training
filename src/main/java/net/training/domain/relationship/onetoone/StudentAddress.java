package net.training.domain.relationship.onetoone;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class StudentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "house")
	private int house;
	
	@Column(name = "flat")
	private int flat;
	
	@OneToOne(mappedBy = "address")
	private Student student;
}
