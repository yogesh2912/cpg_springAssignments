package com.cg.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SerImpl implements IService, DisposableBean, InitializingBean, 
						BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	private String msg;
	
	public SerImpl() {
		System.out.println("Service constructor");
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Injected msg");
	}

	@Override
	public String sayHello(String str) {
		return msg + " " + str;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("disposable - destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set - init");
	}
	
	public void myInit() {
		System.out.println("custom Init");
	}
	
	public void myDestroy() {
		System.out.println("custom Destory");
	}

	@Override
	public void setBeanName(String bname) {
		System.out.println("bean name " + bname);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactory Aware");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("ApplicationContext Aware");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("pre destroy");
	}
}







