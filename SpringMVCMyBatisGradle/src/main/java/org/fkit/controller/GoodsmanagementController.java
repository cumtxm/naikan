package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.fkit.service.GoodsmanagementService;
import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoodsmanagementController {
	@Autowired
	@Qualifier("goodsmanagementService")
	private GoodsmanagementService GoodsmanagementService;
	@RequestMapping(value="/goodsmanagement")
	public String goodsmanagement(Model model){
		// 修改商品
		List<Goods> goodsmanagement_list = GoodsmanagementService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("goodsmanagement_list", goodsmanagement_list);
		// 跳转到main页面
		return "goodsmanagement";
	}
	@RequestMapping(value="/goodsinsert")
	 public ModelAndView goodsinsert(
			 String name, String price,String image,String sort,String image1,String image2,String image3,
			 ModelAndView mv,
			 HttpSession session){
		Goods goodsinsert = GoodsmanagementService.goodsinsert
				(name, price,image,sort,image1,image2,image3);
		return mv;
	}
	@RequestMapping(value="/removegoods")
	public ModelAndView removegoods(int id,ModelAndView mv,
			 HttpSession session){
		GoodsmanagementService.goods(id);
		mv.setViewName("adminturn");
		return mv;
	}//修改
	
	@RequestMapping(value="/goodsupdate")
	 public String goodsupdate(
			 @RequestParam Integer id,@Param("name")String name,@Param("price")String price,@Param("sort")String sort,
		 ModelAndView mv,
			 HttpSession session){
		Goods goods=GoodsmanagementService.goodsupdate
		(id,name,price,sort);
		return "goodsmanagement";
	}
	@RequestMapping(value="/listgoods")
	public String listgoods(@RequestParam("id")Integer id,Model model){
		Goods goods=GoodsmanagementService.getid(id);
		model.addAttribute("goods", goods);
		return "goodsupdate";
	}
	//库存情况
	@RequestMapping(value="/goodsstock")
	public String goodsstock(Model model){
		// 修改商品
		List<Goods> goodsstock = GoodsmanagementService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("goodsstock", goodsstock);
		// 跳转到main页面
		return "goodsstock";
	}
	@RequestMapping(value="/stockupdate")
	 public String stockupdate(
			 @RequestParam Integer id,@Param("stock")String stock,
		 ModelAndView mv,
			 HttpSession session){
		Goods stockupdate=GoodsmanagementService.stockupdate
		(id,stock);
		return "adminturn";
	}
	@RequestMapping(value="/liststock")
	public String liststock(@RequestParam("id")Integer id,Model model){
		Goods goods=GoodsmanagementService.getid(id);
		model.addAttribute("goods", goods);
		return "stockupdate";
	}
}
