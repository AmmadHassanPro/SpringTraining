package com.MVCHibernate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MVCHibernate.model.Goal;
public interface GoalService {
	Goal save(Goal goal);

	List<Goal> findAllGoals();

}
