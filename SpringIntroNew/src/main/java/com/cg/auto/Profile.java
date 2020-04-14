package com.cg.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	   @Autowired
	  // @Qualifier("student2")
	   private Student student;

	   public void printAge() {
	      System.out.println("Age : " + student.getAge() );
	   }
	   public void printName() {
	      System.out.println("Name : " + student.getName() );
	   }
	}