package com.shenhx.manytomany;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.ClassMap;
import org.apache.ibatis.javassist.expr.NewArray;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.shenhx.manytomany.mapper.StudentMapper;
import com.shenhx.manytomany.model.Course;
import com.shenhx.manytomany.model.Student;
import com.shenhx.manytomany.model.StudentCourseLink;

/**
 * Unit test for simple App.
 */
public class ManyToManyTest {
	private static SqlSessionFactory sqlSessionFactory;

	public static void Test(String[] args) {
		String resource = "mybatis3.cfg.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);

		try {
			System.out.println("打印学生选课课程");
			List<Student> students = mapper.selectStudentCourse();
			session.commit();
			for (Student student : students) {
				System.out.println(student.toString());
			}
			System.out.println("开始删除学生1的1门课程：");
			StudentCourseLink studentCouseLink = new StudentCourseLink(new Student(1),new Course(2),new Date());
			mapper.deleteStudentCourseById(studentCouseLink);
			System.out.println("重新打印学生选课课程：");
			students = mapper.selectStudentCourse();
			session.commit();
			for (Student student : students) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
}
