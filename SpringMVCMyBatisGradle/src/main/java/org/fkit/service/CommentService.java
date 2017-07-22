package org.fkit.service;

import java.util.List;

import org.fkit.domain.Comment;

public interface CommentService {
		Comment comment(Integer order_id,Integer logistics,Integer quality,Integer service,String picture,String comment);
		
		List<Comment> getAll();
}
