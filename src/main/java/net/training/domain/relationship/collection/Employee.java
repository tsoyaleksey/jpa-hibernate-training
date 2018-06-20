package net.training.domain.relationship.collection;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Data
@Entity
public class Employee extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@ElementCollection
	@CollectionTable(name = "email", 
					joinColumns = @JoinColumn(name = "employee_id"))
	private List<String> emails = new ArrayList<>();
}
