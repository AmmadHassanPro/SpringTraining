package com.BeanScope.SpringScopeBeanDemo.Configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.BeanScope.SpringScopeBeanDemo.Beans.CounterObj;
import com.BeanScope.SpringScopeBeanDemo.Beans.ParentBean;

@Configuration
@PropertySources({
	@PropertySource("classpath:CounterObject.properties"),
	@PropertySource("classpath:ParentBean.properties")	
	}
	)
public class ConfigForThisApp {
	@Value("${parent.startingcount}")
	int parentingStartingCount;
	@Value("${child.startingcount}")
	int ChildCount;
	
@Bean
public ParentBean getParentBean() {
	
	ParentBean pB = new ParentBean(new CounterObj());
	pB.setParentCount(parentingStartingCount);
	//pB.myCountObj.setChildCount(ChildCount);
	return pB;
	
}	

@Bean
public CounterObj getCounterObject() {
	CounterObj cObj = new CounterObj();
	cObj.setChildCount(ChildCount);
	return cObj;
	
}
	
	
	
	
}
