package com.pluralsight.SpringBootDemo.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name="course_id")
	private String courseId;
	
	public Courses(int id, String courseName, String courseId) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseId = courseId;
	}
	
	public Courses() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	}

}
