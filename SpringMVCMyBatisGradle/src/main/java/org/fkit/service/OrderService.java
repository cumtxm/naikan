package org.fkit.service;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.domain.OrderItem;

public interface OrderService {
	List<Order> getAll(Integer user_id);
	
	Order order(Integer id,String payment,String status,String time,Integer user_id);
	void order(int id);
	//评论
	Order getorder(Integer id);
	//订单状态修改
	List<Order> getAll1();
	Order updateorder(Integer id);
	Order updateorder1(Integer id);
}
