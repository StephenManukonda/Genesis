package com.learn.SpringAnnotationsNoXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("collegeBean")
// if the name is not given here then default bean name is classname in lowercase
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	//@Qualifier("science")
	// Here teacher has multiple implementations but using @primmary will allow us which to call default. 
	private Teacher teacher;
	
	
	public void testMethod() {
		principal.getPrincipalName();
		teacher.teach();
		System.out.println(collegeName);
	}
	

}
