package com.masai;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class userlogin{
	
     
      //Login.....................................................
	static void userlogin() throws IOException, ClassNotFoundException {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Email");
	String Email=sc.next();
	
	System.out.println("Enter Password");
	String Password=sc.next();
	
	
	
//	Deserialization Start from here.................................................
	 List<Signup > data=new ArrayList<>();
     
     FileInputStream fis=new FileInputStream("data.p");
     
     ObjectInputStream ois=new ObjectInputStream(fis);
     
     while(fis.available()>0){
    	 Signup  std=(Signup )ois.readObject();
    	 data.add(std);
     }

     fis.close();
     ois.close();


     for(Signup  p:data){
    	 if(Email.equals(p.email)&&Password.equals(p.Password)) {
    		 System.out.println("Login success");
    		 
    	 }else {
    		 System.out.println("User name not exsit, you need to SingUp First.");
    		 userSingUpn(); 
    	 }
         
     }
	
	
}
	
	
	//Signup.....................................
    static void userSingUpn() throws IOException, ClassNotFoundException {
    	
    	List<Signup > sing=new ArrayList<>();
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter Email");
    	String Email=sc.next();
    	
    	System.out.println("Enter Mobile");
    	String Mobile=sc.next();
    	System.out.println("Enter name");
    	String name=sc.next();
    	
    	System.out.println("Enter add");
    	String add=sc.next();
    	
    	System.out.println("Create your Password");
    	String Password=sc.next();
    	
    	sing.add( new Signup (Email,Mobile,name,add,Password));
    	
    	
  //  	Serialization start from hare..............................................
    	
    	FileOutputStream fos=new FileOutputStream("data.p");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        for(Signup  st:sing){
            oos.writeObject(st);
        }

        System.out.println("Now you need to Login");
       
        fos.close();
        oos.close();
        
 userlogin();
    }
    
    public static void AdminLogin(){
    	System.out.println("Welcome to Safe Way,Made your life easier");
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter User Id");
    	String Email=sc.next();
    	
    	System.out.println("Enter Password");
    	String Password=sc.next();
    }


	
}