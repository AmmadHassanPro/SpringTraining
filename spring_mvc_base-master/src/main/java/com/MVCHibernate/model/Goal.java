package com.MVCHibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="goals")
@NamedQueries({
@NamedQuery(name=Goal.Get_All_Goals, query = "Select g from Goal g")	,

@NamedQuery(name=Goal.Get_All_GoalsReport, query = "Select new com.MVCHibernate.model.GoalReport(g.minutes, e.minutes, e.activity)"+"from Goal g,Exercise e where g.id =e.goal.id")
	
	
})

public class Goal {
    
	public static final String Get_All_Goals = "getAllGoalls";
	public static final String Get_All_GoalsReport = "getAllGoalsReport";
	
	
	@Id
	@GeneratedValue
	private Long id;
	@OneToMany(mappedBy="goal",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Exercise> exercises;
	
	@Range(min = 1, max = 120)
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
