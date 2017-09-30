package com.MVCHibernate.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MVCHibernate.model.Activity;
import com.MVCHibernate.model.Exercise;
import com.MVCHibernate.repository.ExcersiceRepository;



@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	@Autowired
	private ExcersiceRepository excersicerepo;
	
	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}

	//Transactions must be on the service layer
	@Transactional
	public Exercise save(Exercise excersice) {
	
		return excersicerepo.save(excersice);
	}
	
}
