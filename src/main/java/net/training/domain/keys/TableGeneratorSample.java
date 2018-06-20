package net.training.domain.keys;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Data
@Entity
@TableGenerator(name = "ID_TABLE_GEN", table = "SEQUENCES", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_NUM", allocationSize = 1)
public class TableGeneratorSample {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "ID_TABLE_GEN")
	private long id;
}
