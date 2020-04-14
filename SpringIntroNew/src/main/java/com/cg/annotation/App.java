package com.cg.annotation;

public class App {
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void message() {
		System.out.println("hi");
	}

	public void init() {
		System.out.println("Bean is going to init");
	}

	public void clean() {
		System.out.println("Bean will destroy");
	}

}
