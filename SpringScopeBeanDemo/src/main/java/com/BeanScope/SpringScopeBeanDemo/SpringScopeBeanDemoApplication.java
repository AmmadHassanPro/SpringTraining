package com.BeanScope.SpringScopeBeanDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.BeanScope.SpringScopeBeanDemo.Beans.ParentBean;

@SpringBootApplication
@ComponentScan("com.BeanScope.SpringScopeBeanDemo")
public class SpringScopeBeanDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringScopeBeanDemoApplication.class, args);
		ParentBean pBean = (ParentBean) ctx.getBean("parentBean");
		pBean.printCurrentCount();
		pBean.printParentCount();
		pBean.IncrementCount();
		pBean.IncrementParentCount();
		pBean.printCurrentCount();
		pBean.printParentCount();
		
		System.out.println("Object Changed");
		ParentBean p2Bean = (ParentBean) ctx.getBean("parentBean");
		p2Bean.printCurrentCount();
		p2Bean.printParentCount();
		p2Bean.IncrementCount();
		p2Bean.IncrementParentCount();
		p2Bean.printCurrentCount();
		p2Bean.printParentCount();
		
		
		
		
		System.out.println("Object reverted back");
		pBean.printCurrentCount();
		pBean.printParentCount();
		pBean.IncrementCount();
		pBean.IncrementParentCount();
		pBean.printCurrentCount();
		pBean.printParentCount();
		
		
	}
}
