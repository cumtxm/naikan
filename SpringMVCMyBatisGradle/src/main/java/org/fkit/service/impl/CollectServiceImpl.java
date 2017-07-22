package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Collect;
import org.fkit.mapper.CollectMapper;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("CollectService")
public class CollectServiceImpl implements CollectService {
	@Autowired
	private CollectMapper collectMapper;
	@Override
	public List<Collect> getAll(Integer user_id) {
		// TODO Auto-generated method stub
		return collectMapper.findAll(user_id);
	}

	@Override
	public Collect collect(String name, String image, String price,Integer user_id,Integer goods_id) {
		// TODO Auto-generated method stub
		return collectMapper.insertcollect(name, image,price,user_id,goods_id);
	}
	@Override
	public Collect collectFind(Integer user_id, Integer goods_id) {
		return collectMapper.collectFind(user_id, goods_id);
	}
	
	@Override
	public void collect(int id) {
		// TODO Auto-generated method stub
		collectMapper.removecollect(id);
	}

}
