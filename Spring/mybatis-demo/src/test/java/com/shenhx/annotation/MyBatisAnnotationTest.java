package com.shenhx.annotation;

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

import com.shenhx.annotation.mapper.UserMapper;
import com.shenhx.dynamicsql.model.User;


/**
 * Unit test for simple App.
 */
public class MyBatisAnnotationTest {
	private static SqlSessionFactory sqlSessionFactory;

	public static void Test(String[] args) {
		String resource = "mybatis4.cfg.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);

		try {
			User user = getUser();
			mapper.insertUser(user);
			int userId = user.getId();
			System.out.println("插入完成，返回数据："+userId);
			User user2 = mapper.selectUserById(userId);
			System.out.println(user2);
			System.out.println("查找列表");
			List<User> userList = mapper.selectAllUser();
			for(User user3 : userList){
				System.out.println(user3);
			}
//			mapper.deleteUser(userId);
//			System.out.println("查找列表2");
//			userList = mapper.selectAllUser();
//			for(User user3 : userList){
//				System.out.println(user3);
//			}
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
	
	private static User getUser() {
		User user = new User();
		user.setUsername("xiaomei");
		user.setPassword("1234565");
		user.setPhone("10086");
		user.setAddress("guangzhou");
		user.setAge(12);
		return user;
	}
}
