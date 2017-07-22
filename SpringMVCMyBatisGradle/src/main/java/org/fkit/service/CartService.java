package org.fkit.service;

import java.util.List;

import org.fkit.domain.Cart;

public interface CartService {
	List<Cart> getAll(Integer user_id);
	
	Cart cart(String name,String image,String price,Integer quantity,Integer user_id);
	
	void cart(int id);
}
