package service;

import dao.JdbcDaoImpl;

public class JdbcServiceImpl implements Iservice{
	private JdbcDaoImpl jdbcObj;
	
	

	public JdbcServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("jdbc constructor service");
	}

	public JdbcDaoImpl getJdbcObj() {
		return jdbcObj;
	}

	public void setJdbcObj(JdbcDaoImpl jdbcObj) {
		this.jdbcObj = jdbcObj;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return jdbcObj.type();
	}
	
	

}
