package com.student.utiltiy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.student.entities.Course;
import com.student.entities.Student;



public class FileExists {

//for course data storing
	public static Map<Integer, Course> courseFile() {
		
		Map<Integer, Course>  cFile = null;

		File f = new File("course.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {

				cFile = new LinkedHashMap<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(cFile);
				return cFile;

			} else {

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				cFile = (Map<Integer, Course>) ois.readObject();

				return cFile;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return cFile;
	}

	
//	for the studet data storing
	public static Map<String, Student> studentFile() {

		Map<String, Student> sFile = null;

		File f = new File("student.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				
				sFile = new LinkedHashMap<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(sFile);
				return sFile;

			} else {
				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				sFile = (Map<String, Student>) ois.readObject();

				return sFile;

			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
		return sFile;
	}
}

