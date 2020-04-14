package com.cg.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
	    //Change the behavior of mycar in xml file
		Car objA = (Car) context.getBean("mycar");
	    objA.getPrice();
        objA.getModel();
        
	}

}
