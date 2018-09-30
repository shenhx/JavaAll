package com.shiyanlou.springboot.dao.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiyanlou.springboot.entity.User;

// @Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 保存
	 * @param user
	 * @return
	 */
	// @Transactional(rollbackFor = Exception.class)
	public User save(User user){
		userRepository.save(user);
		// int i = 1/0;
		user.setPassword("123456");
		return userRepository.save(user);
	}
}
