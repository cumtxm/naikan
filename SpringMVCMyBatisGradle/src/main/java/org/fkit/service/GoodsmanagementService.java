package org.fkit.service;

import java.util.List;

import org.fkit.domain.Goods;

public interface GoodsmanagementService {
	List<Goods> getAll();
	Goods goodsinsert(String name,String price,String image,String sort,String image1,String image2,String image3);
	void goods(int id);
	//修改
	Goods getid(Integer id);
	Goods goodsupdate(Integer id,String name,String price,String sort);
	//stock
	Goods stockupdate(Integer id,String stock);
}
