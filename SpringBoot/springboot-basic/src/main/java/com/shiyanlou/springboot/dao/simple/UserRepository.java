package com.shiyanlou.springboot.dao.simple;

import org.springframework.data.repository.CrudRepository;

import com.shiyanlou.springboot.entity.User;

/**
 * 继承自CrudRepository
 * @author 623724489
 *
 */
public interface UserRepository extends CrudRepository<User,Integer> {

}
