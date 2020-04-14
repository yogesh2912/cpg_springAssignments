package com.cg.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.first.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
	    Employee objA = (Employee) context.getBean("employee"); //this is bean id constructor  injects  data into another class
	    
	     System.out.println( objA.getEid());
	     System.out.println(objA.getEname());
	     System.out.println(objA.getAddress().getCity());
	     System.out.println(objA.getAddress().getState());
	     System.out.println(objA.getAddress().getPincode());
	}

}
