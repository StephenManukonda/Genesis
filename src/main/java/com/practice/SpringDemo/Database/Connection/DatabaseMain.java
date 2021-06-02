package com.practice.SpringDemo.Database.Connection;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		DatabaseConnection connection = context.getBean("database", DatabaseConnection.class);
		try {
			connection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch Fblock
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
