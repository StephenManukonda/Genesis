package com.pluralsight.SpringBootDemo.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.pluralsight.SpringBootDemo.config.Courses;

@Repository
public interface CoursesRepository {
	
	public List<Courses> getAllCourses();
	
	public Courses getCourse(int id);
	
	public void deleteCourse(int id);
	
	public void updateCourse(Courses courses);
	
	public Courses addCourse(Courses courses);
	

}
