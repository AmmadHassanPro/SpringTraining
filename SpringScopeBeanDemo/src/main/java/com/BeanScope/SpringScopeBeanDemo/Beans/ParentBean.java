package com.BeanScope.SpringScopeBeanDemo.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Scope("prototype")
public class ParentBean {

public int ParentCount= 0;
@Autowired // EVEn though I have not annotated this class with @Componenet, but since I have CounterObj listed as a bean in the configuration file, I can just put the autowired here and then it will inject only the bean that was declard in the configuration file
public CounterObj myCountObj;


public void setParentCount(int c) {
	this.ParentCount = c;
	
}
	
public ParentBean(CounterObj temp) {
	this.myCountObj = temp;
	
	
}

public void IncrementParentCount() {
	
	
	System.out.println("Parent Count Inremented");
	
	ParentCount++;
	
}


public void printParentCount() {
	
	System.out.println("Parent Count:"+ParentCount);
	
	
}


public void printCurrentCount() {
	
	System.out.println("Current Count:"+myCountObj.getCount());
	
}
	
public void IncrementCount() {
	System.out.println("Incremented");
	myCountObj.IncrementCount();
	
}	
	
	
}
