package com.main.SpringDependency.Dependents;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service 
@Primary
public class HybridEngine implements Engine {
	@Override
	public String getType() {
		
		return "Hybrid Engine!";
		
		
	}


}
