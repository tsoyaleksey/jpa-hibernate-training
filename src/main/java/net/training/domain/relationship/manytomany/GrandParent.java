package net.training.domain.relationship.manytomany;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Data
@Entity
public class GrandParent extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany
	@JoinTable(
			name = "GRANDPA_TO_CHILD",
			joinColumns = @JoinColumn(name = "GRANDPA_ID", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "CHILD_ID", referencedColumnName = "id")
			)
	private Set<GrandChild> childrens = new HashSet<>();

}
