package com.shiyanlou.springboot.dao.maindb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiyanlou.springboot.entity.UserOne;

@Service
public class UserOneService {

	@Autowired
	private UserOneRepository userOneRepository;

	@Transactional(rollbackFor = Exception.class)
	public UserOne save(UserOne userOne) {
		return userOneRepository.save(userOne);
	}
}
