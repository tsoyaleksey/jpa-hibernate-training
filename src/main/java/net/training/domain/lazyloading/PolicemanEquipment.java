package net.training.domain.lazyloading;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@Table(name = "police_equipment")
public class PolicemanEquipment extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "owner")
	private LazyPoliceman lazyPoliceman;

}
