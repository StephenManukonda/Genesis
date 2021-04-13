package com.learn.SpringAnnotationsNoXml;

import org.springframework.stereotype.Component;

@Component("science")
public class ScienceTeacher implements Teacher{

	public void teach() {
		System.out.println("I teach Science");
	}

}
