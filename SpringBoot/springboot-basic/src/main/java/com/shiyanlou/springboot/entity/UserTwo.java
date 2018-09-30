package com.shiyanlou.springboot.entity;

import javax.persistence.*;

/**
 * 用户
 * @author 623724489
 *
 */
@Table(name = "user_two")
@Entity
public class UserTwo {

	/**
	 * 设置主键字段
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	/**
	 * 用户名
	 */
	@Column
	private String username;

	/**
	 * 密码
	 */
	@Column
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String toString() {
		return "user{" + "id=" + id + "username=" + username + "password="
				+ password + "}";
	}
}
