package net.training;

import javax.sql.DataSource;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

import com.ninja_squad.dbsetup.destination.Destination;

public abstract class AbstractIntegrationTests {
	
	protected Destination destination;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Before
	public void init() {
		this.destination = new TransactionAwareDestination(dataSource, transactionManager);
	}

}
