package com.shenhx.dynamicsql;

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

import com.shenhx.dynamicsql.mapper.UserMapper;
import com.shenhx.dynamicsql.model.User;


/**
 * Unit test for simple App.
 */
public class MybatisDynamicSqlTest {
	private static SqlSessionFactory sqlSessionFactory;

	public static void Test(String[] args) {
		String resource = "mybatis5.cfg.xml";
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
			User user = new User();
			user.setUsername("xiao");
			System.out.println("selectUserList:");
			List<User> userList = mapper.selectUserList(user);
			for(User user2 : userList){
				System.out.println(user2);
			}
			System.out.println("selectUserList2:");
			userList = mapper.selectUserList2(user);
			for(User user2 : userList){
				System.out.println(user2);
			}
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
}
