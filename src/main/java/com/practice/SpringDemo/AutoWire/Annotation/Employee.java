package com.practice.SpringDemo.AutoWire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private Salary salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void getsal() {
		salary.calculateSalar();
	}
	@Autowired
	public Employee(Salary salary) {
		super();
		this.salary = salary;
	}

	/**
	 * @return the salary
	 */
	public Salary getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	

}
