package org.fkit.service;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Collect;
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
public class CollectServiceTest {
	@Autowired 
	 private CollectService CollectService;

	@Test
	public void testGetAll() {
		List<Collect> collect_list = CollectService.getAll(2);
		System.out.println(collect_list);
	}
	@Test
	public void testCollectFind() {
		Collect mycollect = CollectService.collectFind(2,1);
		if(mycollect != null){
			 System.out.println("该商品已收藏过!");	
		}else{
		CollectService.collect("无袖连衣裙","1.jpg","169",2,1);
		System.out.println("收藏成功");
		}
	}

//	@Test
//	public void testCollectInt() {
//		CollectService.collect(36);
//		System.out.println("删除成功");
//	}

}
