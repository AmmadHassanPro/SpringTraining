package com.MVCHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MVCHibernate.model.Goal;
import com.MVCHibernate.repository.GoalRepositoryImpl;
@Service
public class GoalServiceImpl implements GoalService {

	

	@Autowired
	private GoalRepositoryImpl goalRepo;

	@Transactional
	public Goal save(Goal goal) {
		
		
		
		return this.goalRepo.save(goal);
	}
	
	public List<Goal> findAllGoals() {
	
		List goals = goalRepo.getAllGoalls();
		
		return  goals;
	}
	
	
	
}
