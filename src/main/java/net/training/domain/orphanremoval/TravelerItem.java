package net.training.domain.orphanremoval;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class TravelerItem extends BaseEntity {

	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "owner")
	private Traveler owner;
}
