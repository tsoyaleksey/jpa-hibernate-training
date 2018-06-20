package net.training.repository;

import java.util.List;

import net.training.domain.BaseEntity;

public interface IRepository<T extends BaseEntity> {
	
	List<T> findAll();

}
