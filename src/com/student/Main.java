package com.student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Product;
import com.masai.service.ProductService;
import com.masai.utility.IDGeneration;
import com.student.ExceptionClass.CourseException;
import com.student.ExceptionClass.InvalidDetailsException;
import com.student.entities.Course;
import com.student.entities.Student;
import com.student.services.courseService;
import com.student.services.courseServiceImp;
import com.student.services.studentServiceImp;
import com.student.utiltiy.Admin;
import com.student.utiltiy.FileExists;

public class Main {

//	addmin loginfunction method
	private static void adminFuntionality(Scanner sc,Map<Integer, Course> crs,Map<String, Student> std) throws InvalidDetailsException {
		adminLoginfunctionality(sc);
		courseService crs_svs = new courseServiceImp();
		//studentService cusService = new studentServiceImp();
		try {
			int chose = 0;
			do {
				System.out.println("Press 1 add the Course");
				System.out.println("Press 2 view all the course");
				System.out.println("Press 3 delete the course");
				System.out.println("Press 4 update the course");
				System.out.println("Press 5 view all student");
				System.out.println("Press 6 to log out");
				System.out.println("-----------------------------------------------");
				chose = sc.nextInt();
				switch (chose) {
				case 1:
					String returnMsg = adminAddCourse(sc,crs,crs_svs);
					System.out.println(returnMsg);
					break;
				case 2:
					adminViewAllCourse(crs,crs_svs);
					break;
				case 3:
					adminDeleteCourse(sc);
					break;
				case 4:

					String upt = adminUpdateCourse(sc,crs,crs_svs);
					System.out.println(upt);
					break;
				case 5:
					//adminViewAllStudent();

					break;

				case 6:
					System.out.println("admin has successfully logout");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + chose);
				}

			} while (chose > 6);

		} catch (Exception e) {
			System.out.println("Invalid option selection");
		}

	}

	private static void adminLoginfunctionality(Scanner sc) throws InvalidDetailsException {
		System.out.println("Enter the Username");
		String userName = sc.next();
		System.out.println("Enter the Password");
		String password = sc.next();
		System.out.println("-----------------------------------------------");
		if (userName.equals(Admin.userName) && password.equals(Admin.password)) {
			System.out.println("Admin logged Succesfully");
		} else {
			throw new InvalidDetailsException("Invalid Admin Credentials");
		}

	}

	//to add course from the admin
	public static String adminAddCourse(Scanner sc, Map<Integer, Course> course, courseService crs_svs) {

		String str = null;
		System.out.println("Please enter the course details");
		System.out.println("Enter the course name");
		String cname = sc.next();
		System.out.println("Enter the course type(Full time/Part time)");
		String type = sc.next();
		System.out.println("Enter the course price");
		double cfee = sc.nextDouble();
		System.out.println("Enter the course duration");
		int duration = sc.nextInt();
		System.out.println("Enter the course Id");
		int cid = sc.nextInt();

		Course courseadd = new Course(cname, type, cfee, duration, cid);

		str = crs_svs.addCourse(courseadd,course);// considering all details are valid

		return str;

	}
	
	// view all the courses added by admin
	private static void adminViewAllCourse(Map<Integer, Course> course, courseService crs_svs) throws CourseException {
		
          crs_svs.viewAllCourse(course);
	}

	
	// delete course from the admin section
	private static void adminDeleteCourse(Scanner sc) {

	}
	//updated the course by the admin
	private static String adminUpdateCourse(Scanner sc, Map<Integer, Course> course, courseService crs_svs) throws CourseException {
		String updateRes = null;
		System.out.println("Please enter the course details which want to update!");
		System.out.println("Enter the course name");
		String cname = sc.next();
		System.out.println("Enter the course type(Full time/Part time)");
		String type = sc.next();
		System.out.println("Enter the course price");
		double cfee = sc.nextDouble();
		System.out.println("Enter the course duration");
		int duration = sc.nextInt();
		System.out.println("Enter the course Id");
		int cid = sc.nextInt();

		Course updated = new Course(cname, type, cfee, duration, cid);

         updateRes=crs_svs.updateCourse(cid,updated,course);// considering all details are valid
         System.out.println(updated);
		return updateRes;
		
	}

	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
// student LoginFunctionality method	
	private static void studentLoginFunctionality() {

	}

	
	
	
// student signup functionality;	
	private static void studentRegistrationFunctionality(Scanner sc) {
		Student std = new Student();
		System.out.println("Enter the Student detail for Registration");
		System.out.println("------------------------------------------");
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter your Gender");
		String gender = sc.next();
		System.out.println("Enter your Address");
		String address = sc.next();
		System.out.println("Enter your Email");
		String email = sc.next();
		System.out.println("Enter your Password");
		String password = sc.next();
		System.out.println("Enter Course Id");
		String cid = sc.next();

		try {

		} catch (Exception e) {

		}

	}

	// main method start from here
	public static void main(String[] args) {

		Map<Integer, Course> crs = FileExists.courseFile();
		Map<String, Student> std = FileExists.studentFile();
		// List<Transaction> transactions = FileExists.transactionFile();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome ,In the ASM System");
		System.out.println("-----------------------------------------------");

		try {
			int preferance = 0;
			do {
				System.out.println("Enter" + " '1' --> Admin login");
				System.out.println("Enter" + " '2' --> student Login");
				System.out.println("Enter" + " '3' --> student registration");
				System.out.println("Enter" + " '0' --> Exit from  System");
				System.out.println("-----------------------------------------------");

				preferance = sc.nextInt();
				/* to check the preferance and redurect the user according */
				switch (preferance) {
				case 1:
					adminFuntionality(sc,crs,std);
					break;
				case 2:
					studentLoginFunctionality();
					break;
				case 3:
					studentRegistrationFunctionality(sc);
					break;
				case 0:
					System.out.println("succesfully exit from the System");
					break;
				default:
					throw new IllegalArgumentException("Invalid entry");
				}
			} while (preferance != 0);

		} catch (Exception e) {
			System.out.println("you entering the wrong details");
		} finally {
			// serialization (finally always executed)
			try {
				ObjectOutputStream coos = new ObjectOutputStream(new FileOutputStream("Product.ser"));
				coos.writeObject(crs);
				ObjectOutputStream soos = new ObjectOutputStream(new FileOutputStream("Customer.ser"));
				coos.writeObject(std);
				coos.close();
				soos.close();
				// System.out.println("serialized..........");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}

	}

}
