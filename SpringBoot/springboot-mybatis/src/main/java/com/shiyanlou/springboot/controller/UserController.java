package com.shiyanlou.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiyanlou.springboot.entity.User;
import com.shiyanlou.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;
	
	@Autowired
	public UserController(UserService service) {
		this.userService = service;
	}
	
	@PostMapping()
	public String save(User user) {
		userService.save(user);
		return "success";
	}
	
	// /user/1
	@PutMapping("{id}")
	public String  update(User user,@PathVariable int id) {
		if(userService.findById(id) == null) {
			return "not exists";
		}
		if(user.getId() != id) {
			return "unmatched";
		}
		userService.update(user);
		return "done";
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable int id) {
		userService.delete(id);
		return "sucess";
	}
	
	@GetMapping()
	public  List<User> list() {
		return userService.list();
	}
	
	@GetMapping("{id}")
	public User getById(@PathVariable int id) {
		return userService.findById(id);
	}
}
