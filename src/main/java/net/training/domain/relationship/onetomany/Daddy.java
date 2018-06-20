package net.training.domain.relationship.onetomany;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Data
@Entity
public class Daddy extends BaseEntity {
	
	@Column(name = "name")
	private String name;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "daddy", cascade = CascadeType.ALL)
	private List<Kid> kids = new ArrayList<>();
}
