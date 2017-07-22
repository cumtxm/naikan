package org.fkit.controller;

import java.util.List;

import org.fkit.domain.Goods;
import org.fkit.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoodsController {
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	@RequestMapping(value="/allgoods")
	public String main(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到main页面
		return "allgoods";
	}
	@RequestMapping(value="/sort1")
	public String sort1(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll1();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到main页面
		return "sort1";
	}
	@RequestMapping(value="/sort2")
	public String sort2(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll2();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到main页面
		return "sort2";
	}
	@RequestMapping(value="/sort3")
	public String sort3(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll3();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到main页面
		return "sort3";
	}
	@RequestMapping(value="/sort4")
	public String sort4(Model model){
		// 获得所有图书集合
		List<Goods> goods_list = goodsService.getAll4();
		// 将图书集合添加到model当中
		model.addAttribute("goods_list", goods_list);
		// 跳转到main页面
		return "sort4";
	}
	@RequestMapping(value="/details")
	public String details(Model model,@RequestParam int goods_id){
		// 获得所有图书集合
		Goods goods = goodsService.getgoods(goods_id);
		// 将图书集合添加到model当中
		model.addAttribute("goods", goods);
		// 跳转到main页面
		return "details";
	}
}
