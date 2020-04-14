package com.cg.auto;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");

      Profile profile = (Profile) context.getBean("profile");
      profile.printName();
      profile.printAge();
   }
}