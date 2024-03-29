package org.fkit.service;
import org.fkit.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
public class RegisterServiceTest {
	@Autowired 
	 private RegisterService registerService;
	@Test
	public void testRegister() {
		User insert = registerService.register
				("lxl", "789456123","789456123",
				"13325649874@163.com","13325649874");
		System.out.println("注册成功");
	}

}
