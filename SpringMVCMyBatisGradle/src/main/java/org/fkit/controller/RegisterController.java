package org.fkit.controller;

import javax.servlet.http.HttpSession;
import org.fkit.domain.User;
import org.fkit.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RegisterController {
	@Autowired
	@Qualifier("RegisterService")
	private RegisterService RegisterService;
	@RequestMapping(value="/register")
	 public ModelAndView register(
			 String username,String password,String password1,String email,String phone,
			 ModelAndView mv,
			 HttpSession session){
		User register = RegisterService.register
				(username, password,password1,
				email,phone);
		return mv;
	}
}
