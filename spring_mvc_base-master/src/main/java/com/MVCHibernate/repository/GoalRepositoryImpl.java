package com.MVCHibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.MVCHibernate.model.Goal;
import java.util.List;
@Repository
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {


		em.persist(goal);
		em.flush();
		
		return null;
	}

	public List getAllGoalls() {
		
		Query query = em.createQuery("Select g from Goal g");
		
		List goal = query.getResultList();
		
		return goal;
	}



}
