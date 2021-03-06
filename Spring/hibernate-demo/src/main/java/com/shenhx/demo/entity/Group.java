package com.shenhx.demo.entity;

import java.util.Set;

public class Group {
	private int id;
    private String groupname;
    private Set<User> users;
	@Override
	public String toString() {
		return "Group [id=" + id + ", groupname=" + groupname + ", users="
				+ users + "]";
	}
	public Group(int id, String groupname, Set<User> users) {
		super();
		this.id = id;
		this.groupname = groupname;
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public Group() {
		// TODO Auto-generated constructor stub
	}
}
