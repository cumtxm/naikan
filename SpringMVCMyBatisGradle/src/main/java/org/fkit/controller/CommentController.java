package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.fkit.service.CommentService;
import org.fkit.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommentController {
	@Autowired
	@Qualifier("CommentService")
	private org.fkit.service.CommentService CommentService;
	@RequestMapping(value="/comment")
	public ModelAndView comment(Integer order_id,Integer logistics,Integer quality,Integer service,String picture,String comment,
			ModelAndView mv,
			 HttpSession session){
		CommentService.comment(order_id, logistics, quality, service, picture, comment);
		mv.setViewName("turn");
		return mv;
	}
	@RequestMapping(value="/mcomment")
	public String mcomment(Model model){
		// 获得所有图书集合
		List<Comment> comment_list = CommentService.getAll();
		// 将图书集合添加到model当中
		model.addAttribute("comment_list", comment_list);
		// 跳转到main页面
		return "mcomment";
	}
}
