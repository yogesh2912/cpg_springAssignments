package com.cg.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.second.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		App app = (App) factory.getBean("newworld");
		
		System.out.println(app.getMessage());
		
		Employee emp=(Employee) factory.getBean("employee");
		System.out.println(emp.getEname());
		System.out.println(emp.getAddress().getState());
		
		((AnnotationConfigApplicationContext) factory).close();
	}

}
