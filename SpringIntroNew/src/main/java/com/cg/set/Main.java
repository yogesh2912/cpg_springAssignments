package com.cg.set;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		CollectionSample objA = (CollectionSample) context.getBean("countries");
		System.out.println(objA.getCountry());
		List<String> list = objA.getMyList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// access map
		System.out.println("---access map---");
		Map<Integer, String> map = objA.getMyMap();
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		// access properties
		System.out.println("---access properties---");
		Properties prop = objA.getMyProp();
		System.out.println(prop.getProperty("propKeyA"));
		System.out.println(prop.getProperty("propKeyB"));
		((ClassPathXmlApplicationContext) context).close();
	}

}
