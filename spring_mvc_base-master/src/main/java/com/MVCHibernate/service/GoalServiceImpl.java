package com.MVCHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MVCHibernate.model.Goal;
import com.MVCHibernate.repository.GoalRepositoryImpl;
@Service
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepositoryImpl goalRepo;

	
	public Goal save(Goal goal) {
		
		
		
		return this.goalRepo.save(goal);
	}
	
	
	
	
}
