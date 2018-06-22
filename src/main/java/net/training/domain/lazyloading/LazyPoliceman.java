package net.training.domain.lazyloading;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Data
@Entity
public class LazyPoliceman extends BaseEntity {
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY) // by default
	private List<Document> documents = new ArrayList<>();
	
	@OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
	private List<Donut> donuts = new ArrayList<>();
	
	@OneToOne(mappedBy = "lazyPoliceman", fetch = FetchType.LAZY)
	private PolicemanEquipment equipment;

}
