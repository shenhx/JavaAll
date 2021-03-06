package com.shenhx.onetoone;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.ClassMap;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.shenhx.onetoone.mapper.ClassesMapper;
import com.shenhx.onetoone.model.Classes;

/**
 * Unit test for simple App.
 */
public class OneToOneTest {
	private static SqlSessionFactory sqlSessionFactory;

	public static void Test(String[] args) {
		String resource = "mybatis2.cfg.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		ClassesMapper mapper = session.getMapper(ClassesMapper.class);

		try {
			Classes classes = mapper.selectClassById(1);
			session.commit();
			System.out.println(classes.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
	}
}
