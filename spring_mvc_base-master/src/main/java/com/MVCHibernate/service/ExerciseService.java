package com.MVCHibernate.service;

import java.util.List;

import com.MVCHibernate.model.Activity;

public interface ExerciseService {

	List<Activity> findAllActivities();

}