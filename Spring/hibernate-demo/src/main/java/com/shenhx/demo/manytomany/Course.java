package com.shenhx.demo.manytomany;

import java.util.Set;

public class Course {

	private int id;
	public Course() {
		super();
	}
	public Course(int id, String courseName, Set<Student> students) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName
				+ ", students=" + students + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	private String courseName;
	private Set<Student> students;

}
