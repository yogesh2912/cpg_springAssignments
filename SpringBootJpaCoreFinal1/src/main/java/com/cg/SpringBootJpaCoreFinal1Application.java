package com.cg;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

@SpringBootApplication
public class SpringBootJpaCoreFinal1Application implements CommandLineRunner{

	
	@Autowired
	private IEmpDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaCoreFinal1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		List<Emp> lst=dao.viewEmp();
		
		lst.forEach(System.out::println);
		
//		Emp emp=new Emp();
//		emp.setEmpName("pritam");
//		emp.setEmpId(3008);
//		emp.setEmpSal(1500);
//		emp.setDoj(LocalDate.of(2018, 12, 27));
//		emp.getDept().setDeptId(2);
//		dao.addEmp(emp);
//		System.out.println("Successfully added");
	}

}
