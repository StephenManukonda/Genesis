package com.learn.SpringAnnotationsNoXml;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	void getPrincipalName() {
		System.out.println("Principal name is Sarath");
	}

}
