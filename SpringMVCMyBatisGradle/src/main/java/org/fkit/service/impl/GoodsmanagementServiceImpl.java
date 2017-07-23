package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Goods;
import org.fkit.mapper.GoodsmanagementMapper;
import org.fkit.service.GoodsmanagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodsmanagementService")
public class GoodsmanagementServiceImpl implements GoodsmanagementService {
	@Autowired
	private GoodsmanagementMapper goodsmanagementMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getAll() {
		// TODO Auto-generated method stub
		return goodsmanagementMapper.findAll();
	}
	@Override
	public Goods goodsinsert(String name, String price,String image,String sort,String image1,String image2,String image3) {
		// TODO Auto-generated method stub
		return goodsmanagementMapper.goodsinsert(name, price,image,sort,image1,image2,image3);
	}
	@Override
	public void goods(int id){
		goodsmanagementMapper.removegoods(id);
	}
	//修改
	@Override
	public Goods getid(Integer id) {
		// TODO Auto-generated method stub
		return goodsmanagementMapper.findid(id);
	}
	@Override
	public Goods goodsupdate(Integer id,String name,String price,String sort) {
		return goodsmanagementMapper.goodsupdate(id,name,price,sort);
	}
	//stock
	@Override
	public Goods stockupdate(Integer id,String stock) {
		return goodsmanagementMapper.stockupdate(id,stock);
	}
}
