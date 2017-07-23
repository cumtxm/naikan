package org.fkit.service;

import org.fkit.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/applicationContext.xml","classpath*:/springmvc-config"})

public class UserServiceTest {
	@Autowired 
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
