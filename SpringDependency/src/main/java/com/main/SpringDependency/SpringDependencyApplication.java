package com.main.SpringDependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.main.SpringDependency.Controller.MyController;
import com.main.SpringDependency.Dependents.tyre;
import com.main.SpringDependency.Dependents.vehicle;



@SpringBootApplication
public class SpringDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyApplication.class, args);
		
		
	vehicle Ford = (vehicle) ctx.getBean("vehicle");
	System.out.println(Ford.GetInfo());
//	tyre Tyre = (tyre) ctx.getBean("tyre");

	}
}
