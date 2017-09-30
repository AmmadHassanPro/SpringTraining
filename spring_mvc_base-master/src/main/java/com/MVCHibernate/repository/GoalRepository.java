package com.MVCHibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MVCHibernate.model.Goal;
import com.MVCHibernate.model.GoalReport;
@Repository
public interface GoalRepository extends JpaRepository<Goal,Long> {
	
	@Query("Select new com.MVCHibernate.model.GoalReport(g.minutes, e.minutes, e.activity)"+"from Goal g,Exercise e where g.id =e.goal.id")
	 List<GoalReport> getAllGoalsReport();
	
	

}
