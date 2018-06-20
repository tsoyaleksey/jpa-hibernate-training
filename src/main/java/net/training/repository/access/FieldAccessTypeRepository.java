package net.training.repository.access;

import java.util.List;

import net.training.domain.access.FieldAccessType;
import net.training.repository.AbstractRepository;

import org.springframework.stereotype.Repository;

@Repository
public class FieldAccessTypeRepository extends AbstractRepository<FieldAccessType> {

	@Override
	public List<FieldAccessType> findAll() {
		return this.manager.createQuery("select f from FieldAccessType f", FieldAccessType.class).getResultList();
	}

}
