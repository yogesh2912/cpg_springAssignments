package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import dao.JpaDaoImpl;
import service.IService;
import service.IServiceImpl;

@Configuration
@ComponentScan("service,dao")
@PropertySource("classpath:cg.properties")
public class MyConfig {
	
	
//	@Bean(name="jpadao")
//	public JpaDaoImpl gett() {
//		return new JpaDaoImpl();
//	}
//
//	
//	@Bean(name="myser")
//	public IServiceImpl get() {
//		return new IServiceImpl();
//	}
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getPlaceholder() {
		return new PropertySourcesPlaceholderConfigurer();
	}// ye wala bean ko comment krne se bhi chalega/......this will sustitute placeholder from environmnet variable ...this concept is not clear from this example.ye bean(psphc)ka use idher nhi dikh rha
	
	
}
