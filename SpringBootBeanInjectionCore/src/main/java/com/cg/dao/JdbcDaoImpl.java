package com.cg.dao;

import org.springframework.stereotype.Component;

@Component("jdbcdao")
public class JdbcDaoImpl implements Idao{
	
	public JdbcDaoImpl() {
		System.out.println("Constructor jdbc dao");
		
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "jdbc dao";
	}

}
