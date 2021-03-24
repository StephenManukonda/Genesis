package com.pluralsight.SpringBootDemo.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.SpringBootDemo.config.Courses;
import com.pluralsight.SpringBootDemo.services.CoursesService;

@Path("/courses")
public class CoursesController {
	
	@Autowired
	CoursesService coursesService;
	
	@Path("/getCourses")
	@GET
	public List<Courses> getAllCourses() {
		return coursesService.getAllCourses();
	}
	
	@Path("/addCourse")
	@POST
	public Courses addCourses(Courses courses) {
		return coursesService.addCourse(courses);
	}
	

}
