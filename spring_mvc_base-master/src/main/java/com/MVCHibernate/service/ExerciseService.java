package com.MVCHibernate.service;

import java.util.List;

import com.MVCHibernate.model.Activity;
import com.MVCHibernate.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();
	Exercise save (Exercise excersice);

}