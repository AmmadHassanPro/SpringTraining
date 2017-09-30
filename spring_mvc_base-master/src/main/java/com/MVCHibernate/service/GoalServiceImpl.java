package com.MVCHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MVCHibernate.model.Goal;
import com.MVCHibernate.model.GoalReport;
import com.MVCHibernate.repository.GoalRepository;

@Service
public class GoalServiceImpl implements GoalService {

	


	@Autowired
	private GoalRepository goalRepo;
	
	
	public List<GoalReport> getAllGoalsReport() {
		return goalRepo.getAllGoalsReport();
	

	}


	@Transactional
	public Goal save(Goal goal) {
		
		
		
		return this.goalRepo.save(goal);
	}
	
	public List<Goal> findAllGoals() {
	
		List goals = goalRepo.findAll();
		
		return  goals;
	}
	
	
	
}
