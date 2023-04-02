package com.student.services;

import java.util.Map;

import com.student.ExceptionClass.CourseException;
import com.student.entities.Course;


public interface courseService {
	public String  addCourse(Course addCrs, Map<Integer, Course> crs) ;
	
	public void viewAllCourse(Map<Integer, Course> crs) throws CourseException ;

	public void deleteCourse(int id, Map<Integer, Course> crs) ;

	public String updateCourse(int id, Course addcrs, Map<Integer, Course> crs) throws CourseException;

}
