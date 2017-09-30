package com.MVCHibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.MVCHibernate.model.Goal;
import com.MVCHibernate.model.GoalReport;

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
	
	public List getAllGoalsReport() {
	//	Query query =em.createQuery("Select new com.MVCHibernate.model.GoalReport(g.minutes, e.minutes, e.activity)"+"from Goal g,Exercise e where g.id =e.goal.id ");
		TypedQuery<GoalReport> query=em.createNamedQuery(Goal.Get_All_GoalsReport,GoalReport.class);
		
		List goalReports = query.getResultList();
		return goalReports;
	}

	public List getAllGoalls() {
		
	//	Query query = em.createQuery("Select g from Goal g");
		TypedQuery<Goal> query=em.createNamedQuery(Goal.Get_All_Goals,Goal.class);
		
		List goal = query.getResultList();
		
		return goal;
	}



}
