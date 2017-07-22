package org.fkit.service.impl;
import org.fkit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.fkit.mapper.RegisterMapper;
import org.fkit.service.RegisterService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("RegisterService")
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterMapper RegisterMapper;
	@Override
	public User register(String username, String password,String password1,String email, String phone) {
		// TODO Auto-generated method stub
		return RegisterMapper.insertuser(username, password,password1,email, phone);
	}

}