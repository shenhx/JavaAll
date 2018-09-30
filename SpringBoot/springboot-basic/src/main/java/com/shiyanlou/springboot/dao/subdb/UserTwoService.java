package com.shiyanlou.springboot.dao.subdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiyanlou.springboot.entity.UserTwo;

@Service
public class UserTwoService {

	@Autowired
	private UserTwoRepository userTwoRepository;

	@Transactional(rollbackFor = Exception.class)
	public UserTwo save(UserTwo userTwo) {
		return userTwoRepository.save(userTwo);
	}
}
