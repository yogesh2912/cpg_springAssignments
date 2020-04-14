package com.cg.dao;

import org.springframework.stereotype.Component;

@Component("jpadao")
public class JpaDaoImpl implements Idao{
	
	public JpaDaoImpl() {
		System.out.println("Constructor jpa dao");
	}

	@Override
	public String type() {
		return "Jpa dao";
	}

}
