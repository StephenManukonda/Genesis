package com.pluralsight.SpringBootDemo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.SpringBootDemo.config.Courses;
import com.pluralsight.SpringBootDemo.repositories.CoursesRepository;

@Service
public class CoursesService {

	@Autowired
	CoursesRepository repository;

	public List<Courses> getAllCourses() {
		List<Courses> courses = repository.getAllCourses();
		return courses;
	}

	public Courses getCourses(int id) {
		Courses course = repository.getCourse(id);
		return course;

	}
	
	public void deleteCourse(int id) {
		repository.deleteCourse(id);
	}
	
	public Courses addCourse(Courses  courses) {
		return repository.addCourse(courses);
	}
	
	public void updateCourse(Courses courses) {
		 repository.updateCourse(courses);
	}

}
