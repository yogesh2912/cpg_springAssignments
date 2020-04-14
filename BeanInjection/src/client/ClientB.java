package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ClientB {
	
	static BeanFactory context;
	public static void main(String[] args) {
		
		context=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		
	}

}
