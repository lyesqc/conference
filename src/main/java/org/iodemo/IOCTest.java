package org.iodemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("iotest")

public class IOCTest {
	//@Autowired
	ChildClass child;
	/*@Autowired
	
	public IOCTest( ChildClass  child ){
		child.display();
	}
	*/
	
	@Autowired
	@Qualifier("iochild")
	public void ptMe(ChildClass child){
		System.out.println("setting up child instance ");
		child.display();
		this.child = child;
	}

	public void makeDisplay(){
		child.display();
	}
		

}
