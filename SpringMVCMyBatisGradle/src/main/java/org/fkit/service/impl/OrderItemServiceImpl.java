package org.fkit.service.impl;

import java.util.List;

import org.fkit.mapper.OrderItemMapper;
import org.fkit.domain.OrderItem;
import org.fkit.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("OrderItemService")
public class OrderItemServiceImpl implements OrderItemService {
	@Autowired
	private OrderItemMapper OrderItemMapper;
	@Override
	public List<OrderItem> getAll(Integer order_id) {
		// TODO Auto-generated method stub
		return OrderItemMapper.findAll(order_id);
	}

}
