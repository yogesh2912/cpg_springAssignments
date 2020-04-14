package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientA {
	
	static ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarService cs1=(CarService)context.getBean("car1");
		cs1.drive();
		
		CarService cs2=(CarService)context.getBean("car2");
		cs2.drive();
	}

}
