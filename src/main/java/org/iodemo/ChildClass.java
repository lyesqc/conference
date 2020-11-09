package org.iodemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("iochild")
public class ChildClass {
	public void display(){
		System.out.println("Hi this inject by constructor");
	}

}
