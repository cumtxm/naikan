package org.fkit.service;


import java.util.List;

import org.fkit.domain.Cart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
public class CartServiceTest {
	@Autowired 
	 private CartService CartService;
	@Test
	public void testGetAll() {
		List<Cart> cart_list = CartService.getAll(2);
		System.out.println(cart_list);
	}

	@Test
	public void testCartStringStringStringIntegerInteger() {
		Cart cart=CartService.cart
		("无袖连衣裙","1.jpg","159",3,2,1);
		System.out.println("添加成功");
	}


}
