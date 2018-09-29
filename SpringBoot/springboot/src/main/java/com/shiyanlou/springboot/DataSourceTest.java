package com.shiyanlou.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.shiyanlou.springboot.dao.maindb.UserOneService;
import com.shiyanlou.springboot.dao.subdb.UserTwoService;
import com.shiyanlou.springboot.entity.UserOne;
import com.shiyanlou.springboot.entity.UserTwo;

@Component
public class DataSourceTest implements ApplicationRunner {

	@Autowired
	public UserOneService userOneService;

	@Autowired
	public UserTwoService userTwoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 新建一个实体类
		UserOne userOne = new UserOne();
		userOne.setUsername("shiyanlou1");
		userOne.setPassword("springboot1");
		// 调用Service
		userOneService.save(userOne);
		UserTwo userTwo = new UserTwo();
		userTwo.setPassword("shiyanlou2");
		userTwo.setUsername("springBoot2");
		// 调用Service
		userTwoService.save(userTwo);
	}

}
