package com.shenhx.demo.manytomany;

import java.util.Set;

public class Student {

	private int id;
	private String stuname;
	private Set<Course> courses;
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuname=" + stuname + ", courses="
				+ courses + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public Student() {
		super();
	}
	public Student(int id, String stuname, Set<Course> courses) {
		super();
		this.id = id;
		this.stuname = stuname;
		this.courses = courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
