package com.main.SpringDependency.Dependents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class vehicle {
	@Autowired @Qualifier("hybridEngine")
	private Engine engine;
	private tyre Tyres;
	private door Doors;
	
	public vehicle(tyre t , door d, @Qualifier("hybridEngine") Engine E) {
		this.Tyres = t;
		this.Doors = d;
		this.engine = E;
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
