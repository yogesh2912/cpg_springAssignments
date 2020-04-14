package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	static ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IService iObj=(IService)context.getBean("myser");
		
		System.out.println(iObj.getData("pwd"));
		
		

	}

}
