package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	@Autowired
	@Qualifier("CartService")
	private CartService CartService;
	@RequestMapping(value="/cart")
	public String cart(Model model,Integer user_id){
		// 获得所有图书集合
		List<Cart> cart_list = CartService.getAll(user_id);
		// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
		// 跳转到main页面
		return "cart";
	}
	@RequestMapping(value="/cart1")
	public ModelAndView cart1(String name,String image,String price,Integer quantity,Integer user_id,Integer goods_id,
			ModelAndView mv,
			 HttpSession session){
		Cart mycart = CartService.cartFind(user_id,goods_id);
		if(mycart != null){
		CartService.updatecart(user_id, goods_id, quantity);
		mv.setViewName("turn");	
		}else{
		CartService.cart
				(name,image,price,quantity,user_id,goods_id);
		mv.setViewName("turn");
		}
		return mv;
	}
		
	@RequestMapping(value="/removecart")
	public ModelAndView removecart(int id,ModelAndView mv,
			 HttpSession session){
		CartService.cart(id);
		mv.setViewName("turn");
		return mv;
	}
}
