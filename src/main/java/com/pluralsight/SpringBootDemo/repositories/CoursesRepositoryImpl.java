/**
 * 
 */
package com.pluralsight.SpringBootDemo.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.SpringBootDemo.config.Courses;

public class CoursesRepositoryImpl implements CoursesRepository {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Courses> getAllCourses() {
		Session session = (Session) this.sessionFactory.getCurrentSession();
		List<Courses> courses = session.createQuery("from Courses").list();
		return courses;
	}

	@Override
	public Courses getCourse(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Courses course = session.get(Courses.class, id);
		return course;
	}

	@Override
	public void deleteCourse(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Courses courses = session.load(Courses.class, id);
		if (courses != null) {
			session.delete(id);
		}

	}

	@Override
	public void updateCourse(Courses courses) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(courses);
	}

	@Override
	public Courses addCourse(Courses courses) {
		Session session = this.sessionFactory.getCurrentSession();
		Courses course = (Courses) session.save(courses);
		return course;
	}

}
