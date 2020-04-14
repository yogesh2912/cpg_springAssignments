package com.cg.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cg.second.Address;
import com.cg.second.Employee;

@Configuration
//@Import(ConfigA.class)
public class AppConfig {

	@Bean(name = "newworld", initMethod = "init", destroyMethod = "clean")
	@Scope("singleton")
	 //@Scope("prototype")
	public App createAppBean() {
		App app = new App();
		app.setMessage("LPU");
		return app;
	}

	@Bean(name = "employee")
	public Employee empLpu() {
		Employee emp = new Employee(1, "Suraj", addLpu());
		return emp;
	}

	@Bean
	public Address addLpu() {
		Address add = new Address();
		add.setCity("phagwara");
		add.setState("punjab");
		add.setPincode(1234);
		return add;
	}
}
