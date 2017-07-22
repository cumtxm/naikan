package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE tb_user(
id INT PRIMARY KEY AUTO_INCREMENT,      #id
username VARCHAR(18),		# 用户名
PASSWORD VARCHAR(18),			#密码
email VARCHAR(50) UNIQUE,			#邮箱
phone VARCHAR(18),			#电话
);
 * */
public class User implements Serializable{

	private int id;			// id
	private String username;	// 登录名
	private String password;	// 密码
	private String password1;
	private String email;	// 邮箱
	private String phone;		// 电话
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", password1="+ password1 + ",email=" + email + ", phone=" + phone
				+ "]";
	}
	
	
}
