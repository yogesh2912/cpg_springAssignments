package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean(name="car1")
	public CarFactory getCar() {
		return new CarFactory();
	}

	@Bean(name="car2")
	public CarService getCar2() {
		return new CarService();
	}
}
