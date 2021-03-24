package com.pluralsight.SpringBootDemo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.pluralsight.SpringBootDemo.controllers.UsersController;

@Component
@ApplicationPath("/api")
public class RestConfig extends ResourceConfig{

	public RestConfig(Class<?>... classes) {
		//register(UsersController.class); 
		packages("com.pluralsight.SpringBootDemo.controllers");
	}
	

}
