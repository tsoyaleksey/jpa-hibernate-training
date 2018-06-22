package net.training.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class SoftSkill extends BaseEntity {

	@Column(name = "name")
	private String name;
}
