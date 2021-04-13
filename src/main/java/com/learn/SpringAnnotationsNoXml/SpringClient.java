package com.learn.SpringAnnotationsNoXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		// if you want to use xml as configuration for component scan you have to load
		// the xml file
		// and in the xml file you have to provide base package name for scanning components
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");

		// If you want to use annotation config then ou have use the below class and
		// provide the class which has configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		System.out.println("Xml file loaded");
		College c = context.getBean("collegeBean", College.class);
		c.testMethod();
		System.out.println("College createdd");
	}

}
