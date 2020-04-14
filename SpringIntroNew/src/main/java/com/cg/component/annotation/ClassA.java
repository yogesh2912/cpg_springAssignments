package com.cg.component.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	//@Autowired
	private ClassB cb;
	
	public int add(int x, int y) {
		return x + y;
	}
	public ClassB getCb() {
		return cb;
	}
	@Autowired
	public void setCb(ClassB cb) {
		this.cb = cb;
	}
}
