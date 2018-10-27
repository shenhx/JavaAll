package com.shenhx.demo.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.shenhx.demo.entity.Group;
import com.shenhx.demo.entity.User;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		// query();
		// insertByEjb();
		// onToMany();
		// manyToOne();
		manyToMany();
	}

	private static void manyToMany() {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		com.shenhx.demo.manytomany.Course course1 = new com.shenhx.demo.manytomany.Course();
		course1.setCourseName("语文");
		com.shenhx.demo.manytomany.Course course2 = new com.shenhx.demo.manytomany.Course();
		course2.setCourseName("数学");
		
		com.shenhx.demo.manytomany.Student student = new com.shenhx.demo.manytomany.Student();
		// user.setId(1);
		student.setStuname("shx");
		com.shenhx.demo.manytomany.Student student2 = new com.shenhx.demo.manytomany.Student();
		// user.setId(1);
		student2.setStuname("shx2");
		
		// 选课
		student.setCourses(new HashSet<>());
		student.getCourses().add(course1);
		
		student2.setCourses(new HashSet<>());
		student2.getCourses().add(course1);
		student2.getCourses().add(course2);
		
		session.save(course1);
		session.save(course2);
		session.save(student);
		session.save(student2);
		
		course1.setStudents(new HashSet<>());
		course2.setStudents(new HashSet<>());
		course1.getStudents().add(student);
		course1.getStudents().add(student2);
		course2.getStudents().add(student2);
		
		
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	private static void manyToOne() {
		Configuration configuration = new Configuration().configure();

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();
		com.shenhx.demo.manytoone.Group group = new com.shenhx.demo.manytoone.Group();
		group.setGroupname("401");
		
		com.shenhx.demo.manytoone.User user = new com.shenhx.demo.manytoone.User();
		// user.setId(1);
		user.setUsername("shx");
		user.setPassword("123456");
		user.setUserGroup(group);
		session.save(user);
		session.save(group);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	/**
	 * 新增
	 * 
	 * @param args
	 */
	public static void insert() {
		Configuration configuration = new Configuration().configure();

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		User user = new User();
		user.setId(1);
		user.setUsername("shx");
		user.setPassword("123456");
		session.save(user);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	/**
	 * 查询
	 */
	public static void query() {
		Configuration configuration = new Configuration().configure();

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		StringBuilder hqlBuilder = new StringBuilder();
		hqlBuilder.append("from").append(" ").append(User.class.getSimpleName());
		org.hibernate.query.Query query = session.createQuery(hqlBuilder
				.toString());

		List<User> userList = query.list();
		userList.forEach(System.out::println);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	public static void insertByEjb() {
		Configuration configuration = new Configuration().configure();

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		com.shenhx.demo.ejb.User user = new com.shenhx.demo.ejb.User();
		user.setId(1);
		user.setUsername("shx");
		user.setPassword("123456");
		session.save(user);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	public static void onToMany() {
		Configuration configuration = new Configuration().configure();

		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Group group = new Group();
		//group.setId(1);
		group.setGroupname("爬山小组");
		Set<User> userSets = new HashSet<>();
		User user1 = new User();
		//user1.setId(2);
		user1.setUsername("小明");
		user1.setPassword("1");
		userSets.add(user1);
		User user2 = new User();
		//user2.setId(3);
		user2.setUsername("小明23");
		user2.setPassword("1");
		userSets.add(user2);
		group.setUsers(userSets);
		
		for (User user : userSets){
			session.save(user);
		}
		session.save(group);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
}
