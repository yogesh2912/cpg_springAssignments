package service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dao.IDao;

@Component("myser")
public class IServiceImpl implements IService{
	
	private IDao dao;
	
	
//	@Autowired
//	@Qualifier("jdbcdao")
	@Resource(name="${dbean}")
	public void setDao(IDao dao) {
		this.dao = dao;
	}



	public String viewName() {
		return dao.getName();
	}



	public IServiceImpl() {
		super();
		System.out.println("Constructor of Service");
	}

}
