package com.student.services;

import java.util.Map;
import com.student.ExceptionClass.DublicateDataException;
import com.student.entities.Student;

public class studentServiceImp implements studentService {

	@Override
	public boolean login(String email, String password, Map<String, Student> std) throws Exception {
		if (std.containsKey(email)) {

			if (std.get(email).getPassword().equals(password)) {
				return true;
			} else {
				throw new Exception("Invalid Credentials");
			}

		} else {
			throw new Exception("you have not sign up yet, please signup");
		}
	}

	@Override
	public void signUp(Student stdreg, Map<String, Student> std) throws DublicateDataException {
		if (std.containsKey(stdreg.getEmail())) {

			throw new DublicateDataException("student already exists , please login");
		} else {

			std.put(stdreg.getEmail(), stdreg);

		}

	}

	
	@Override
	public Student viewStudentDetails(String email, Map<String, Student> std) {
		if (std.containsKey(email)) {

			return std.get(email);
		}
		return null;
	}

}
