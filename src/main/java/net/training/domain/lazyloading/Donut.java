package net.training.domain.lazyloading;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Data
@Entity
public class Donut extends BaseEntity {
	
	@ManyToMany
	@JoinColumn(name = "owner")
	private LazyPoliceman owner;
	
}
