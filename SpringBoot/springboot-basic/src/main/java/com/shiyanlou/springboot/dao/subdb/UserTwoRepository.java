package com.shiyanlou.springboot.dao.subdb;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shiyanlou.springboot.entity.UserTwo;

@Repository
public interface UserTwoRepository extends CrudRepository<UserTwo,Integer> {

}
