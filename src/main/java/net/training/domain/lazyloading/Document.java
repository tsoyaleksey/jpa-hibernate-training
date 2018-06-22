package net.training.domain.lazyloading;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import net.training.domain.BaseEntity;

@Data
@Entity
public class Document extends BaseEntity {
	
	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner")
	private LazyPoliceman owner;
}
