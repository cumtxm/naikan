package org.fkit.service;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Comment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
public class CommentServiceTest {
	@Autowired 
	 private CommentService CommentService;
	@Test
	public void testComment() {
		CommentService.comment(11, 5, 5, 5, "", "很满意！");
		System.out.println("评论成功");
	}

//	@Test
//	public void testGetAll() {
//		List<Comment> comment_list = CommentService.getAll();
//		System.out.println(comment_list);
//	}

}
