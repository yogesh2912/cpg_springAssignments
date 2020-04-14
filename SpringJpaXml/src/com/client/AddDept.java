package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.IEmpDao;
import com.entity.Dept;

public class AddDept {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("jpaconfig.xml");
		
		IEmpDao dao=(IEmpDao) context.getBean("mydao");
	    Dept dept=new Dept();
	    dept.setDeptName("finance");
	    System.out.println(dept);
	    dao.addDept(dept);
	    System.out.println("department added");
		
	}


}
