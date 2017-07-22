package org.fkit.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fkit.domain.Admin;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String username,String password,boolean check,
			 ModelAndView mv,
			 HttpSession session,HttpServletResponse response){
		Cookie cooks=new Cookie("user",username+""+password);
		cooks.setMaxAge(24*3600);
		response.addCookie(cooks);
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(username, password);
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发到main请求
			mv.setView(new RedirectView("./index"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("login");
		}
		return mv;
	}
	@RequestMapping(value="/update")
	public ModelAndView update(String email, String password,
			 ModelAndView mv,
			 HttpSession session){
				User user = userService.updatepassword
						(email,password);
				mv.setViewName("update");
				return mv; 	
		  }
	@RequestMapping(value="/findpwd")
	 public ModelAndView find(String username,String email,ModelAndView mv,HttpSession session,HttpServletResponse response) throws Exception{		
		User user=userService.findpwd(username, email);
		if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的密码是："+user.getPassword()+"");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("18035379016@163.com","mxz9016mxz");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("18035379016@163.com");
				sendemail.setSubject("找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			mv.setViewName("login");
		
		}else{
			
			response.getWriter().println("密码获取失败");
			System.out.print("密码获取失败");
		}	
		return mv;
	}
	
	@RequestMapping(value="/adminlogin")
	 public ModelAndView adminlogin(
			 String username,String password,boolean check,
			 ModelAndView mv,
			 HttpSession session,HttpServletResponse response){
		Cookie cooks=new Cookie("admin",username+""+password);
		cooks.setMaxAge(24*3600);
		response.addCookie(cooks);
		// 根据登录名和密码查找用户，判断用户登录
		Admin admin = userService.adminlogin(username, password);
		if(admin != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("admin", admin);
			// 转发到main请求
			mv.setView(new RedirectView("./adminindex"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("adminlogin");
		}
		return mv;
	}
	//
	@RequestMapping(value="/listuser")
	public String listuser(@RequestParam("id")Integer id,Model model){
		User user=userService.getuser(id);
		model.addAttribute("user", user);
		return "status";
	}
	//
	@RequestMapping(value="/inform")
	 public ModelAndView inform(String username,String email,ModelAndView mv,HttpSession session,HttpServletResponse response) throws Exception{		
		User user=userService.findpwd(username, email);
		if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的订单已经发货，请您耐心等候！");
			builder.append("");
			builder.append(""+url+"");
			
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("18035379016@163.com","mxz9016mxz");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("18035379016@163.com");
				sendemail.setSubject("订单通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			mv.setViewName("adminturn");
		
		}else{
			
			response.getWriter().println("通知失败");
			System.out.print("订单通知失败");
		}	
		return mv;
	}
}
