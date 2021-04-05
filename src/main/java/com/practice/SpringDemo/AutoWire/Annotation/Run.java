package com.practice.SpringDemo.AutoWire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Employee e=context.getBean("employee", Employee.class);
		e.getsal();
		
	}
}
