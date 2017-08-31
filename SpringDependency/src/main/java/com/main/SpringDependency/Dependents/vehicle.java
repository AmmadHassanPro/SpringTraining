package com.main.SpringDependency.Dependents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class vehicle {
	@Autowired
	private Engine engine;
	private tyre Tyres;
	private door Doors;
	@Autowired
	private Greetings greetings;
	
	public vehicle(tyre t , door d, Engine E, Greetings greet) {
		this.Tyres = t;
		this.Doors = d;
		this.engine = E;
		System.out.println(engine.getType());
		System.out.println(greet.Greet());
	}
	
	public tyre getTyres() {
		return Tyres;
	}
	public void setTyres(tyre tyres) {
		Tyres = tyres;
	}
	public door getDoors() {
		return Doors;
	}
	public void setDoors(door doors) {
		Doors = doors;
	}

	
	public String GetInfo() {
		
		
	
		return new String("Tyres:"+Tyres+" Doors:");
	}
	

}
