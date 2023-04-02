package com.student.entities;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	private String password;
	private String address;
	private String email;
	private String phoneNo;
	private String gender;
	private String dob;
	private int cid;
	
	public Student() {
		super();
	}

	public Student(String name, String password, String address, String email, String phoneNo, String gender,
			String dob, int cid) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.dob = dob;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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
				+ ", phoneNo=" + phoneNo + ", gender=" + gender + ", dob=" + dob + ", cid=" + cid + "]";
	}
	
	
}
