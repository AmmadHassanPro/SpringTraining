package com.BeanScope.SpringScopeBeanDemo.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class CounterObj {

public int count;
public void IncrementCount() {
	count++;
	
}
public int getCount() {
	
	
	return count;
}
	
}
