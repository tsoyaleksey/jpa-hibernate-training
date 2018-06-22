package net.training.domain;

import java.util.List;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = NamedQueryCachingSample.FIND_ALL_BY_NAME, query = "select w from worker w where w.name = :name")
})

@Data
@Entity
@Table(name = "worker")
public class NamedQueryCachingSample extends BaseEntity {

	public static final String FIND_ALL_BY_NAME = "findAllByName";
	
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany
	private List<SoftSkill> softSkills;
}
