package dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jpadao")
public class JpaDaoImpl implements IDao{
	
	

	public JpaDaoImpl() {
		super();
		System.out.println("Constructor of Jpa Dao");
	}

	@Override
	public String getName() {
		
		return "jpa Dao";
	}

}
