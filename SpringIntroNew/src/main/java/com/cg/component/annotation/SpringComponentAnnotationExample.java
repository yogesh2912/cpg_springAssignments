package com.cg.component.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class SpringComponentAnnotationExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cg.component.annotation");
		context.refresh();

		ClassA ca = context.getBean(ClassA.class);

		int result = ca.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + result);
		result=ca.getCb().sub(10,20);
		System.out.println("Substraction of 10 and 20 = " + result);
		context.close();
	}
}