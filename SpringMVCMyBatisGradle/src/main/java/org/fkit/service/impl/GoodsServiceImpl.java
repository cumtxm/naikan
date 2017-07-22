package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Goods;
import org.fkit.mapper.GoodsMapper;
import org.fkit.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getAll() {
		// TODO Auto-generated method stub
		return goodsMapper.findAll();
	}
	public List<Goods> getAll1() {
		// TODO Auto-generated method stub
		return goodsMapper.findAll1();
	}
	public List<Goods> getAll2() {
		// TODO Auto-generated method stub
		return goodsMapper.findAll2();
	}
	public List<Goods> getAll3() {
		// TODO Auto-generated method stub
		return goodsMapper.findAll3();
	}
	public List<Goods> getAll4() {
		// TODO Auto-generated method stub
		return goodsMapper.findAll4();
	}
	public Goods getgoods(int goods_id) {
		// TODO Auto-generated method stub
		return goodsMapper.findgoods(goods_id);
	}
}
