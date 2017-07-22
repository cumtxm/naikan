package org.fkit.service.impl;


import java.util.List;

import org.fkit.domain.Order;
import org.fkit.domain.OrderItem;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("OrderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public List<Order> getAll(Integer user_id) {
		// TODO Auto-generated method stub
		return orderMapper.findAll(user_id);
	}

	@Override
	public Order order(Integer id, String payment, String status, String time,Integer user_id) {
		// TODO Auto-generated method stub
		return orderMapper.insertorder(id, payment, status, time,user_id);
	}
	@Override
	public void order(int id){
		orderMapper.removeorder(id);
	}
	//评论
	@Override
	public Order getorder(Integer id) {
		return orderMapper.findorder(id);
	}
	//订单状态修改
	@Override
	public List<Order> getAll1() {
		// TODO Auto-generated method stub
		return orderMapper.findAll1();
	}
	@Override
	public Order updateorder(Integer id) {
		return orderMapper.updateorder(id);
	}
	@Override
	public Order updateorder1(Integer id) {
		return orderMapper.updateorder1(id);
	}
}
