package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import service.IService;

public class ClientA {
	
	static ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IService ser=(IService) context.getBean("myser",IService.class);
		System.out.println(ser.viewName());

	}

}
