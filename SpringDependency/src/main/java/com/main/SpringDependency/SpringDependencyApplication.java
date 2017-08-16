package com.main.SpringDependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.main.SpringDependency.Controller.MyController;



@SpringBootApplication
public class SpringDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyApplication.class, args);
		
	MyController con = (MyController)ctx.getBean("myController");
		con.hello();
	}
}
