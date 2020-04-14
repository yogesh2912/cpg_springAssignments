package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Idao;
import service.Iservice;

public class ClientA {
	
	static ApplicationContext context;
	public static void main(String[] args) {
		
		context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Iservice iObj=(Iservice) context.getBean("jpaSer");
		
		System.out.println("The type is "+iObj.getType());
		

		Iservice iObj1=(Iservice) context.getBean("jdbcSer");
		
		System.out.println("The type is "+iObj1.getType());
		
		Idao idObj=(Idao) context.getBean("try");
		
		
	}

}
