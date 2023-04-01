package com.student.utiltiy;

import java.util.List;
import com.student.entities.Course;

public interface Student {

	public String studentRegistration();

	public String studentUpdateDetail();

	public List<Course> showAllCorseDetail();

	public Student studentLogin();
}
