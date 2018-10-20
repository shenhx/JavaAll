package com.shenhx.manytomany.model;

import java.util.List;

public class Course {
	 private Integer id;
	    private String name;
	    private Integer credit;
	    private List<Student> students;

	    public Course() {

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

		public Integer getCredit() {
			return credit;
		}

		public void setCredit(Integer credit) {
			this.credit = credit;
		}

		public List<Student> getStudents() {
			return students;
		}

		public void setStudents(List<Student> students) {
			this.students = students;
		}

		public Course(Integer id, String name, Integer credit,
				List<Student> students) {
			super();
			this.id = id;
			this.name = name;
			this.credit = credit;
			this.students = students;
		}
		
		public Course(Integer id) {
			super();
			this.id = id;
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", name=" + name + ", credit=" + credit
					+ ", students=" + students + "]";
		}
	    
	    
}
