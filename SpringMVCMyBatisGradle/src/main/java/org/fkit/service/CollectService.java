package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collect;

public interface CollectService {
	List<Collect> getAll(Integer user_id);
	
	Collect collect(String name,String image,String price,Integer user_id,Integer goods_id);
	
	Collect collectFind(Integer user_id,Integer goods_id);
	
	void collect(int id);
	
}
