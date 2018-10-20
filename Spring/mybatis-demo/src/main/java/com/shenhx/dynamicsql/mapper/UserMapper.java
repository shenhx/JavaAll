package com.shenhx.dynamicsql.mapper;

import java.util.List;

import com.shenhx.dynamicsql.model.User;

public interface UserMapper {

	public List<User> selectUserList(User condition);
	
	public List<User> selectUserList2(User condition);
}
