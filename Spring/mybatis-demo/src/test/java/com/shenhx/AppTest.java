package com.shenhx;

import com.shenhx.annotation.MyBatisAnnotationTest;
import com.shenhx.dynamicsql.MybatisDynamicSqlTest;
import com.shenhx.manytomany.ManyToManyTest;
import com.shenhx.onetomany.OneToManyTest;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// OneToManyTest.Test(args);
		// ManyToManyTest.Test(args);
		// MyBatisAnnotationTest.Test(args);
		MybatisDynamicSqlTest.Test(args);
	}

}
