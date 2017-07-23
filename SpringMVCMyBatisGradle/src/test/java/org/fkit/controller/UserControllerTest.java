package org.fkit.controller;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})

public class UserControllerTest {
	@Autowired 
	@Qualifier("userService")
	 private UserService UserService;

	@Test
	public void testLogin() {
		User u=UserService.login("zxm", "123456");
		if(u!= null){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		
	}
	@Test
	public void testupdatepassword() {
		User user = UserService.updatepassword
				("1284517569@163.com","123456");
		System.out.println("修改成功");
	}
	@Test
	public void testgetuser() {
		User user=UserService.getuser(2);
		System.out.println(user.getUsername());
		System.out.println(user.getemail());
		System.out.println(user.getPhone());
	}
}
