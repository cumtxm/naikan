package org.fkit.controller;

import java.util.List;
import org.fkit.service.OrderItemService;
import org.fkit.domain.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderItemController {
	@Autowired
	@Qualifier("OrderItemService")
	private OrderItemService OrderItemService;
	@RequestMapping(value="/orderItem")
	public String orderItem(Model model,Integer order_id){
		// 获得所有图书集合
		List<OrderItem> orderitem_list = OrderItemService.getAll(order_id);
		// 将图书集合添加到model当中
		model.addAttribute("orderitem_list", orderitem_list);
		// 跳转到main页面
		return "orderItem";
	}
}
