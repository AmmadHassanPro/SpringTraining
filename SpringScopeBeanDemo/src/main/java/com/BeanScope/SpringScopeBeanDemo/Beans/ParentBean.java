package com.BeanScope.SpringScopeBeanDemo.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Scope("prototype")
public class ParentBean {

public int ParentCount= 0;
	
public void IncrementParentCount() {
	
	
	System.out.println("Parent Count Inremented");
	
	ParentCount++;
	
}


public void printParentCount() {
	
	System.out.println("Parent Count:"+ParentCount);
	
	
}

	@Autowired
public CounterObj myCountObj;

public void printCurrentCount() {
	
	System.out.println("Current Count:"+myCountObj.getCount());
	
}
	
public void IncrementCount() {
	System.out.println("Incremented");
	myCountObj.IncrementCount();
	
}	
	
	
}
