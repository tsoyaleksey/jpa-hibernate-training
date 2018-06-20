package net.training.domain.relationship.manytomany;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Data
@Entity
public class GrandChild {
	
	@Column(name = "name")
	private String name;

	@ManyToMany(mappedBy = "childrens")
	private Set<GrandParent> grandParents = new HashSet<>();
}
