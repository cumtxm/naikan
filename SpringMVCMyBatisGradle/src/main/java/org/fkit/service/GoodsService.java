package org.fkit.service;

import java.util.List;

import org.fkit.domain.Goods;

public interface GoodsService {
	/**
	 * 查找所有商品
	 * @return Goods对象集合
	 * */
	List<Goods> getAll();
	List<Goods> getAll1();
	List<Goods> getAll2();
	List<Goods> getAll3();
	List<Goods> getAll4();
	Goods getgoods(int goods_id);

}
