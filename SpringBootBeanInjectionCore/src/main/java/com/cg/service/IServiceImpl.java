package com.cg.service;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.dao.Idao;



@Component("myser")
public class IServiceImpl implements IService{
	
	private Idao dao;
	
	
//	@Autowired
//	@Qualifier("jdbcdao")
	@Resource(name="${dbean}")
	public void setDao(Idao dao) {
		this.dao = dao;
	}



	public String viewName() {
		return dao.type();
	}



	public IServiceImpl() {
		super();
		System.out.println("Constructor of Service");
	}

}
