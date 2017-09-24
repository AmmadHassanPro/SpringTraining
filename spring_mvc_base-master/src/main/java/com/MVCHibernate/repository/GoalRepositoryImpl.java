package com.MVCHibernate.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.MVCHibernate.model.Goal;

public class GoalRepositoryImpl implements GoalRepository {

	@Autowired
	private EntityManager em;
	
	public Goal save(Goal goal) {


		em.persist(goal);
		
		
		return null;
	}

}
