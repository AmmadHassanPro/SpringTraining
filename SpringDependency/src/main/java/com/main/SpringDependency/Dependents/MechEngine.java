package com.main.SpringDependency.Dependents;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service 
public class MechEngine implements Engine {
	@Override
	public String getType() {
		
		return type;
		
		
	}
}
