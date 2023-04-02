package com.student.entities;

import java.io.Serializable;

public class Course implements Serializable {
	private String  courseName;
	private String type;
	private double courseFee;
	private int duration;
	private int courseId;
	
	public Course() {
		super();
	}

	public Course(String courseName, String type, double courseFee, int duration, int courseId) {
		super();
		this.courseName = courseName;
		this.type = type;
		this.courseFee = courseFee;
		this.duration = duration;
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", type=" + type + ", courseFee=" + courseFee + ", duration="
				+ duration + ", courseId=" + courseId + "]";
	}

	

}
