package org.fkit.service;

import org.fkit.domain.Admin;
import org.fkit.domain.User;

/**
 * User服务层接口
 * */
public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String username
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String username,String password);
	User updatepassword(String email,String password);
	User findpwd(String username,String email);

	
	Admin adminlogin(String username,String password);
	//订单状态
	User getuser(Integer id);
}
