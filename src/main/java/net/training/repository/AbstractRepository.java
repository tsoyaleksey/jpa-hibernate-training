package net.training.repository;

import net.training.domain.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository<T extends BaseEntity> implements IRepository<T> {
	
	@PersistenceContext
	protected EntityManager manager;

}
