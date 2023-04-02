package com.student.services;

import java.util.Map;
import java.util.Map.Entry;

import com.student.ExceptionClass.CourseException;
import com.student.entities.Course;

public class courseServiceImp implements courseService {

	public String addCourse(Course courseadd, Map<Integer, Course> crs) {
		// TODO Auto-generated method stub
		crs.put(courseadd.getCourseId(), courseadd);
		return "Course Added Succesfully";
	}

	@Override
	public void viewAllCourse(Map<Integer, Course> crs) throws CourseException {
		if (crs != null && crs.size() > 0) {

			for (Map.Entry<Integer, Course> mp : crs.entrySet()) {
				System.out.println(mp.getValue());
				return;
			}
		} else {
			throw new CourseException("Course List is empty");
		}
	}

	@Override
	public void deleteCourse(int cid, Map<Integer, Course> crs) throws CourseException {
		if (crs != null && crs.size() > 0) {
			if (crs.containsKey(cid)) {
				crs.remove(cid);
				System.out.println("course deleted succesfully");
				return ;
			} else {
				throw new CourseException("course not found");
			}

		} else {
			throw new CourseException("course not found");
		}

	}

	@Override
	public String updateCourse(int cid, Course addcrs, Map<Integer, Course> crs) throws CourseException {
		if (crs != null && crs.size() > 0) {
			if (crs.containsKey(cid)) {
				crs.put(cid, addcrs);
				return "courseUpdate succesfully";
			} else {
				throw new CourseException("course not found");
			}

		} else {
			throw new CourseException("course not found");
		}

	}

}
