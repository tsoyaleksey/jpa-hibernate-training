package net.training.domain.keys;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
public class SequenceGeneratorSample {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private long id;
}
