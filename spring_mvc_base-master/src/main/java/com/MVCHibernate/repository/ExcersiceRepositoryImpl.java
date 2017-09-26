package com.MVCHibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.MVCHibernate.model.Exercise;
@Repository
public class ExcersiceRepositoryImpl implements  ExcersiceRepository{

	@PersistenceContext
	private EntityManager em;
	
	public Exercise save(Exercise excersice) {
		em.persist(excersice);
		em.flush();
		return excersice;
	}

}
