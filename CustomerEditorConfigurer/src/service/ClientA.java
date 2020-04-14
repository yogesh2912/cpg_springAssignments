package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientA {
	
	static ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IEmpSer iObj=(IEmpSer) context.getBean("myser");
		
		System.out.println(iObj.getEmployees());

	}

}
