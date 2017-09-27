package com.MVCHibernate.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.MVCHibernate.model.Goal;

public interface GoalRepository {
	Goal save(Goal goal);
	 List getAllGoalls(); 
}
