package com.practice.SpringDemo.AutoWire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Buddy {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Human human=context.getBean("human", Human.class);
		human.startPumping();
		
	}
}
