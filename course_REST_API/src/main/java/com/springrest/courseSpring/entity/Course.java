package com.springrest.courseSpring.entity;

public class Course {
	private long id;
	private String courseName;
	private String courseCode;

	public Course() {
		super();
	}

	public Course(long id, String courseName, String courseCode) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
