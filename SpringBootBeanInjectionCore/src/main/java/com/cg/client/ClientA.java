package com.cg.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.SpringBootBeanInjectionCoreApplication;
import com.cg.service.IService;

@SpringBootApplication
public class ClientA implements CommandLineRunner{
	
	@Autowired
	private IService ser;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootBeanInjectionCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(ser.viewName());
		
	}

}
