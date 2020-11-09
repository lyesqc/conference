package org.iodemo;

import java.io.IOException;
import java.util.ArrayList;

import org.iodemo.IOCTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) throws  IOException{
		try{
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"mySpringContext2.xml"});
		
		
		/*
		QuantityService	myservice = (QuantityService)context.getBean("quantityService");
		myservice.sendBatchQuantity(new ArrayList<Employee>());
		*/
		IOCTest ioc =  (IOCTest) context.getBean("iotest");
		//ioc.makeDisplay();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
