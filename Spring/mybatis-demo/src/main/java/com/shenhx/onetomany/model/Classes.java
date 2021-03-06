package com.shenhx.onetomany.model;

import java.util.List;

public class Classes {
	private Integer id;
    private String name;
    // 班级和学生是一对多的关系，即一个班级可以有多个学生
    private List<Student> students;
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + ", students="
				+ students + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Classes(Integer id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
    
	public Classes(){
		
	}
}
