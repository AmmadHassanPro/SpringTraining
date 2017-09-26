package com.MVCHibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.MVCHibernate.model.Goal;
@Repository
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {


		em.persist(goal);
		em.flush();
		
		return null;
	}

}
