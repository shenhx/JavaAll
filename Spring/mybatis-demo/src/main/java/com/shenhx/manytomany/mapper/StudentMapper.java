package com.shenhx.manytomany.mapper;

import java.util.List;

import com.shenhx.manytomany.model.Student;
import com.shenhx.manytomany.model.StudentCourseLink;

public interface StudentMapper {

	/**
	 * 查询所有学生及他们的选择课程的信息
	 * 
	 * @return
	 */
	public List<Student> selectStudentCourse();

	/**
	 * 删除指定id用户的某门课（根据课程id）的选课情况
	 * 
	 * @param studentCouseLink
	 */
	public void deleteStudentCourseById(StudentCourseLink studentCouseLink);
}
