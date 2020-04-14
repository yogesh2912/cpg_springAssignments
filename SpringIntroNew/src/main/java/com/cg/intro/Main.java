package com.cg.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      Hello objA = (Hello) context.getBean("helloWorld");//this is bean id in Beans.xml (property injection)

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      Hello objB = (Hello) context.getBean("helloWorld");
	      objB.getMessage();

	}

}
