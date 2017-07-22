package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Comment;
import org.fkit.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("CommentService")
public class CommentServiceImpl implements CommentService {
	@Autowired
	private org.fkit.mapper.CommentMapper CommentMapper;
	@Override
	public Comment comment(Integer order_id, Integer logistics, Integer quality, Integer service, String picture,
			String comment) {
		// TODO Auto-generated method stub
		return CommentMapper.insertcomment(order_id, logistics, quality, service, picture, comment);
	}
	@Override
	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return CommentMapper.findAll();
	}
}
