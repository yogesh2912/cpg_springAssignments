package com.cg.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Car objA = (Car) context.getBean("maruthi");//this is bean id in Beans.xml (constructor injection)
	    Car objb = (Car) context.getBean("suzuki");// we can change bean id in Beans.xml for changing the class object
	      //objA.setPrice(20000);
	      objA.getPrice();
          objA.getModel();
          objb.getPrice();
          objb.getModel();
          System.out.println(objb);
//	      Car objB = (Car) context.getBean("maruthi");
//	      objB.getPrice();

	}

}
