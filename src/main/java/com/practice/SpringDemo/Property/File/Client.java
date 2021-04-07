package com.practice.SpringDemo.Property.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Vehicle vh=context.getBean("vehicle", Vehicle.class);
		vh.printData();
	}
}