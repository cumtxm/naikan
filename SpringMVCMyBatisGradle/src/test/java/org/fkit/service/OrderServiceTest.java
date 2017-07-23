package org.fkit.service;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
public class OrderServiceTest {
	@Autowired 
	 private OrderService OrderService;

	@Test
	public void testGetAll() {
		List<Order> order_list = OrderService.getAll(2);
		System.out.println(order_list);
	}

//	@Test
//	public void testOrderIntegerStringStringStringInteger() {
//		Order insertorder=OrderService.order(15 ,"189", "待发货", "2017-7-23",2);
//		System.out.println("购买成功");
//	}

	@Test
	public void testOrderInt() {
		OrderService.order(15);
		System.out.println("订单删除成功");
	}

	@Test
	public void testGetorder() {
		Order order=OrderService.getorder(4);
		System.out.println(order);
	}

	@Test
	public void testUpdateorder() {
		Order updateorder=OrderService.updateorder
				(14);
		System.out.println("您的订单已经发货");
	}

//	@Test
//	public void testUpdateorder1() {
//		Order updateorder1=OrderService.updateorder1
//				(14);
//	System.out.println("您的订单已经完成");
//	}

}
