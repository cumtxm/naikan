package org.fkit.controller;

import static org.junit.Assert.*;

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
	@Qualifier("UserService")
	 private UserService UserService;

	@Test
	public void testLogin() {
		User u=UserService.login("zxm", "123456");
		if(u!= null){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
		
	}

}
