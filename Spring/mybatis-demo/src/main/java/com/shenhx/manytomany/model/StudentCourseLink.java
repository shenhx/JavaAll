package com.shenhx.manytomany.model;

import java.util.Date;

public class StudentCourseLink {
	private Student student;
	private Course course;
	private Date date;
	public StudentCourseLink(){
		
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public StudentCourseLink(Student student, Course course, Date date) {
		super();
		this.student = student;
		this.course = course;
		this.date = date;
	}
	@Override
	public String toString() {
		return "StudentCouseLink [student=" + student + ", course=" + course
				+ ", date=" + date + "]";
	}
	
	
}
