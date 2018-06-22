package net.training.domain.cascade;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Data
@Entity
public class Stuntman extends BaseEntity {

	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "stuntman", fetch = FetchType.EAGER, 
			cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
	private Set<EquipmentItem> equipmentItems = new HashSet<>();
}
