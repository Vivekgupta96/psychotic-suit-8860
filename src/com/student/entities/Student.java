package com.student.entities;

public class Student {
	
	private String name;
	private String password;
	private String address;
	private String email;
	private String gender;
	private int cid;
	
	public Student() {
		
	}

	public Student(String name, String password, String address, String email, String gender, int cid) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", address=" + address + ", email=" + email
				+ ", gender=" + gender + ", cid=" + cid + "]";
	}

	

}
