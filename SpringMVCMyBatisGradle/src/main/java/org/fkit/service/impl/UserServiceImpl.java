package org.fkit.service.impl;

import org.fkit.domain.Admin;
import org.fkit.domain.User;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String username, String password) {
		return userMapper.findWithusernameAndPassword(username, password);
	}
	@Override
	public User updatepassword(String email, String password) {
		return userMapper.updatepassword(email, password);
	}
	@Override
	public User findpwd(String username, String email) {
		return userMapper.findpwd1(username,email);
	}

	
	@Override
	public Admin adminlogin(String username, String password) {
		return userMapper.findadmin(username, password);
	}
	//
	@Override
	public User getuser(Integer id) {
		return userMapper.finduser(id);
	}
}
