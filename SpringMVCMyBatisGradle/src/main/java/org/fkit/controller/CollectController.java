package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollectController {
	@Autowired
	@Qualifier("CollectService")
	private CollectService CollectService;
	@RequestMapping(value="/collect")
	public String collect(Model model,Integer user_id){
		// 获得所有收藏集合
		List<Collect> collect_list = CollectService.getAll(user_id);
		// 将收藏集合添加到model当中
		model.addAttribute("collect_list", collect_list);
		// 跳转到main页面
		return "collect";
	}
	@RequestMapping(value="/collect1")
	public ModelAndView cart1(String name,String image,String price,Integer user_id,Integer goods_id,
			ModelAndView mv,
			 HttpSession session){
		Collect mycollect = CollectService.collectFind(user_id,goods_id);
		if(mycollect != null){
			mv.addObject("message", "该商品已收藏过!");
			mv.setViewName("collect");
			
		}else{
		CollectService.collect
				(name,image,price,user_id,goods_id);
		mv.setViewName("turn");
		}
		return mv;
	}
	@RequestMapping(value="/removecollect")
	public ModelAndView removecollect(int id,ModelAndView mv,
			 HttpSession session){
		CollectService.collect(id);
		mv.setViewName("turn");
		return mv;
	}
}
