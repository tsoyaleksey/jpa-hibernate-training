package net.training.access;

import net.training.AbstractIntegrationTests;
import net.training.domain.access.FieldAccessType;
import net.training.repository.access.FieldAccessTypeRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.generator.ValueGenerators;
import com.ninja_squad.dbsetup.operation.Operation;

import static com.ninja_squad.dbsetup.Operations.insertInto;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AccessTypeIntegrationTests extends AbstractIntegrationTests {

	@Autowired
	private FieldAccessTypeRepository fieldAccessTypeRepository;
	
	@Test
	public void shouldReturnFieldAccessTypeMappedEntity() {
		//GIVEN
		Operation operation = insertInto("FIELD_ACCESS_TYPE")
							.withGeneratedValue("id", ValueGenerators.sequence())
							.columns("name")
							.values("First")
							.build();
		new DbSetup(destination, operation).launch();
		//WHEN
		List<FieldAccessType> values = this.fieldAccessTypeRepository.findAll();
		//THEN
		assertThat(values).hasSize(1);
	}
}
