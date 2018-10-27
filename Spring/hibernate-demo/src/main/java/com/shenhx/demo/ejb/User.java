package com.shenhx.demo.ejb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jboss.logging.Property;

@Table(name="tb_user2")
@Entity
public class User {

	private int id;
	private String username;
	private String password;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}

	@Id
	@Column(name="fid")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
	}

	@Column(name="fusername")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="fpassword")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
