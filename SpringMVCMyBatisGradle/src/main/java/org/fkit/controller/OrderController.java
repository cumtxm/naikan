package org.fkit.controller;

import java.util.List;
import org.fkit.service.OrderService;
import org.fkit.domain.Order;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("OrderService")
	private OrderService OrderService;
	@RequestMapping(value="/order")
	public String order(Model model,Integer user_id){
		// 获得所有图书集合
		List<Order> order_list = OrderService.getAll(user_id);
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到main页面
		return "order";
	}
	@RequestMapping(value="/order1")
	public ModelAndView order1(Integer id,String payment,String status,String time,Integer user_id,
			ModelAndView mv,
			 HttpSession session){
		OrderService.order
				(id, payment, status, time,user_id);
		mv.setViewName("turn");
		return mv;
	}
	@RequestMapping(value="/removeorder")
	public ModelAndView removeorder(int id,ModelAndView mv,
			 HttpSession session){
		OrderService.order(id);
		mv.setViewName("turn");
		return mv;
	}
	//评论
	@RequestMapping(value="/listorder")
	public String listorder(@RequestParam("id")Integer id,Model model){
		Order order=OrderService.getorder(id);
		model.addAttribute("order", order);
		return "comment";
	}
	//订单管理
	@RequestMapping(value="/morder")
	public String morder(Model model){
		// 获得所有图书集合
		List<Order> order_list = OrderService.getAll1();
		// 将图书集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到main页面
		return "morder";
	}
	//修改订单状态
	@RequestMapping(value="/updateorder")
	 public String updateorder(
			 @RequestParam Integer id,
		 ModelAndView mv,
			 HttpSession session){
		Order updateorder=OrderService.updateorder
		(id);
		return "adminturn";
	}
	@RequestMapping(value="/updateorder1")
	 public String updateorder1(
			 @RequestParam Integer id,
		 ModelAndView mv,
			 HttpSession session){
		Order updateorder1=OrderService.updateorder1
		(id);
		return "adminturn";
	}
}
