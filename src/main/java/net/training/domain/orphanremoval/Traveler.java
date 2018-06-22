package net.training.domain.orphanremoval;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Data
@Entity
public class Traveler extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "owner", orphanRemoval = true, cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	List<TravelerItem> items = new ArrayList<>();

}
