package net.training.domain.cascade;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class EquipmentItem extends BaseEntity {
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "owner")
	private Stuntman stuntman;

}
