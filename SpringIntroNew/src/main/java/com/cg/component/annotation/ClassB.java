package com.cg.component.annotation;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
	public int sub(int x, int y) {
		return x - y;
	}
}
