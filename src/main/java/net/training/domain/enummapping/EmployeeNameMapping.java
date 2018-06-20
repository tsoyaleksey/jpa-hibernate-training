package net.training.domain.enummapping;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "EMPLOYEE_NAME_MAPPING")
public class EmployeeNameMapping extends BaseEntity {

	@Enumerated(EnumType.STRING)
	@Column(name = "seniority")
	private Seniority seniority;
}
