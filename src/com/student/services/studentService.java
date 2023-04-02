package com.student.services;


import java.io.InvalidClassException;
import java.util.Map;

import com.student.ExceptionClass.DublicateDataException;
import com.student.entities.Student;

public interface studentService {

	public boolean login(String email, String password, Map<String, Student> std)throws Exception;

	public Student viewStudentDetails(String email, Map<String, Student> std);

	public void signUp(Student stdreg, Map<String, Student> std) throws DublicateDataException;

}
