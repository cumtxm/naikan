package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Goods;

public interface GoodsMapper {
	@Select(" select * from tb_goods ")
	List<Goods> findAll();
	//所有商品
	@Select(" select * from tb_goods where sort='a'")
	List<Goods> findAll1();
	@Select(" select * from tb_goods where sort='b'")
	List<Goods> findAll2();
	@Select(" select * from tb_goods where sort='c'")
	List<Goods> findAll3();
	@Select(" select * from tb_goods where sort='d'")
	List<Goods> findAll4();
	//分类商品
	@Select(" select * from tb_goods where id=#{goods_id}")
	Goods findgoods(@Param("goods_id") int goods_id);
	//商品详情
}
