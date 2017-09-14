package com.BeanScope.SpringScopeBeanDemo.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype") Scope
public class CounterObj {

public int count;
public void setChildCount(int tempCount) {
	this.count = tempCount;
	
}
public void IncrementCount() {
	count++;
	
}
public int getCount() {
	
	
	return count;
}
	
}
