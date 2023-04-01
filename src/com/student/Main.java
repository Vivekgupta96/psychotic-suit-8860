package com.student;

import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Customer;
import com.masai.entities.Product;
import com.masai.utility.FileExists;
import com.student.ExceptionClass.InvalidDetailsException;
import com.student.entities.Student;
import com.student.utiltiy.Admin;

public class Main {
//	addmin loginfunction method
	private static void adminFuntionality(Scanner sc) throws InvalidDetailsException {
		adminLoginfunctionality(sc);
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
					String added = adminAddCourse(sc);
					System.out.println(added);
					break;
				case 2:

					adminViewAllCourse();
					break;
				case 3:

					adminDeleteCourse(sc);
					break;
				case 4:

					String upt = adminUpdateCourse(sc);
					System.out.println("courseDetailUpdated");
					break;
				case 5:
					adminViewAllStudent();

					break;

				case 6:
					System.out.println("admin has successfully logout");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + chose);
				}

			} while (chose>6);

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
		if(userName.equals(Admin.userName)&&password.equals(Admin.password)) {
			System.out.println("Admin logged Succesfully");
		}
		 else {
			throw new InvalidDetailsException("Invalid Admin Credentials");	
		}
		

	}

	private static void adminViewAllStudent() {

	}

	private static String adminUpdateCourse(Scanner sc) {

		return null;
	}

	private static void adminDeleteCourse(Scanner sc) {

	}

	private static void adminViewAllCourse() {

	}

	private static String adminAddCourse(Scanner sc) {

		return null;
	}

	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
// student LoginFunctionality method	
	private static void studentLoginFunctionality() {
		

	}

// student signup functionality;	
	private static void studentRegistrationFunctionality(Scanner sc) {
		Student std=new Student();
		System.out.println("Enter the Student detail for Registration");
		System.out.println("------------------------------------------");
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter your Gender");
		String gender=sc.next();
		System.out.println("Enter your Address");
		String address=sc.next();
		System.out.println("Enter your Email");
		String email=sc.next();
		System.out.println("Enter your Password");
		String password=sc.next();
		System.out.println("Enter Course Id");
		String cid=sc.next();
		
		try {
			
		}catch(Exception e) {
			
		}
		
	}

	// main method start from here
	public static void main(String[] args) {
		//Map<Integer, Course> products = FileExists.productFile();
		//Map<String, Student> customers = FileExists.customerFile();
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
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
					adminFuntionality(sc);
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
		}

	}

}
