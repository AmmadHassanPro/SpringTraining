package com.MVCHibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.MVCHibernate.model.Exercise;
import com.MVCHibernate.model.Goal;
import com.MVCHibernate.model.GoalReport;
import com.MVCHibernate.service.GoalService;

@Controller
@SessionAttributes("goal")
public class GoalController {
	@Autowired
	private GoalService goalService;

	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		
		return "addGoal";
	}
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("Goal set: " + goal.getMinutes());
		
		if(result.hasErrors()) {
			return "addGoal";
		}
		else {
			
			goalService.save(goal);
		}
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value = "getGoals" ,  method = RequestMethod.GET)
	public String getGoals(Model model) {
		List <Goal>goals = (List<Goal>) goalService.findAllGoals();
		model.addAttribute("Goals",goals);
		
		
		for(int i = 0; i<goals.size(); i++) {
			
			System.out.println("Goal id:"+i);
			System.out.println("Goal Minutes"+ goals.get(i).getMinutes());
			
			for(Exercise ex :goals.get(i).getExercises()){
				
				System.out.println("Excercise id:"+i);
				System.out.println("Activity:"+ex.getActivity());
				System.out.println("Time Performed:"+ex.getMinutes());
				
			}
		
			
			
		}
		
		
		return "getGoals";
		
		
		
	}
	@RequestMapping(value = "getGoalsReport" ,  method = RequestMethod.GET)
	public String getGoalsReport(Model model) {
		
		
		
		List<GoalReport> goalReport = (List<GoalReport>) goalService.getAllGoalsReport();
		model.addAttribute("GoalsReport",goalReport);
		
		return "getGoalsReport";
	}
	
	
}
