package com.shenhx.annotation.model;

public class User {
	  private Integer id; // id，主键
	    private String username; // 用户名 
	    private String password; // 密码
	    private String sex; // 性别
	    private Integer age; // 年龄
	    private String phone; // 电话
	    private String address; // 地址
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password="
					+ password + ", sex=" + sex + ", age=" + age + ", phone="
					+ phone + ", address=" + address + "]";
		}
		public User(){
			
		}
		
		public User(Integer id, String username, String password, String sex,
				Integer age, String phone, String address) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.sex = sex;
			this.age = age;
			this.phone = phone;
			this.address = address;
		}
		
		
}
