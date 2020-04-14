package com.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.IEmpDao;
import com.entity.Emp;

public class AddEmployee {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("jpaconfig.xml");
		IEmpDao dao=(IEmpDao) context.getBean("mydao");
		Emp emp=new Emp();
		emp.setEmpId(1002);
		emp.setEmpName("Madhu");
		emp.setEmpSal(5000);
		emp.setDoj(LocalDate.of(2019, 8, 1));
		emp.getDept().setDeptId(5);
		
		dao.addEmp(emp);
		System.out.println("Employee added");
	}

}
