package com.MVCHibernate.repository;

import org.springframework.stereotype.Repository;

import com.MVCHibernate.model.Goal;

public interface GoalRepository {
	Goal save(Goal goal);
}