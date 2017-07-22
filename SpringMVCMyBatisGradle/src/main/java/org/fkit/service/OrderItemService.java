package org.fkit.service;

import java.util.List;


import org.fkit.domain.OrderItem;

public interface OrderItemService {
	List<OrderItem> getAll(Integer order_id);
}
