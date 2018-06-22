package net.training.repository.access;

import java.util.List;

import net.training.domain.access.MixedAccessType;
import net.training.repository.AbstractRepository;

import org.springframework.stereotype.Repository;

@Repository
public class MixedAccessTypeRepository extends AbstractRepository<MixedAccessType> {

	@Override
	public List<MixedAccessType> findAll() {
		return this.manager.createQuery("select m from mixed_access_type m", MixedAccessType.class).getResultList();
	}

}
