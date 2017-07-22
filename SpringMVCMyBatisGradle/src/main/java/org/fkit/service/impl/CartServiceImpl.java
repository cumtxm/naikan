package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Cart;
import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("CartService")
public class CartServiceImpl implements CartService {
	@Autowired
	private CartMapper cartMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Cart> getAll(Integer user_id) {
		// TODO Auto-generated method stub
		return cartMapper.findAll(user_id);
	}
	@Override
	public Cart cart(String name,String image,String price,Integer quantity,Integer user_id){
		return cartMapper.insertcart(name, image,price,quantity,user_id);
	}
	@Override
	public void cart(int id){
		cartMapper.removecart(id);
	}
	
}
