package com.practice.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Sim sim=context.getBean("airtel",Airtel.class);
		Airtel sim = context.getBean("airtel", Airtel.class);
		sim.calling();
		sim.data();
		sim.getPrice();
		
		Operator s=context.getBean("operator", Operator.class);
		s.call();
		System.out.println();
		

		 System.out.println(sim.getPrice());
	}
}
