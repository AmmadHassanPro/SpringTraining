package com.MVCHibernate.model;

public class GoalReport {
	public GoalReport(int goalMinutes, int exerciseMinutes, String activity) {
		super();
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.activity = activity;
	}
	private int goalMinutes;
	private int exerciseMinutes;
	private String activity;
	
	public int getGoalMinutes() {
		return goalMinutes;
	}
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String acttivity) {
		activity = acttivity;
	}
	

}
