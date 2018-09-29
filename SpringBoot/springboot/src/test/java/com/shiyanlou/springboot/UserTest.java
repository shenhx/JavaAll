package com.shiyanlou.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.shiyanlou.springboot.dao.UserService;
import com.shiyanlou.springboot.entity.User;

@Component
public class UserTest implements ApplicationRunner {

	@Autowired
	public UserService userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		User user = new User();
		user.setPassword("springboot1");
		user.setUsername("shiyanlou");
		userService.save(user);
	}

}
