package com.main.SpringDependency.Dependents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller

public class vehicle {

	@Autowired
	private tyre Tyres;
	@Autowired
	private door Doors;
	public vehicle(tyre t , door d) {
		this.Tyres = t;
		this.Doors = d;
		
		
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
