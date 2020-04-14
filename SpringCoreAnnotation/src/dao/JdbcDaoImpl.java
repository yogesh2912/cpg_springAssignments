package dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jdbcdao")
public class JdbcDaoImpl implements IDao{
	
	

	public JdbcDaoImpl() {
		super();
		System.out.println("Constructor of Jdbc Dao");
	}

	@Override
	public String getName() {
		return "Jdbc Dao";
	}

}
