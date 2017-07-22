package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Goods;
import org.springframework.web.bind.annotation.RequestParam;

public interface GoodsmanagementMapper {
	@Select(" select * from tb_goods ")
	List<Goods> findAll();
	//上架
	@Select("insert into tb_goods(name,price,image,sort,image1,image2,image3) values(#{name},#{price},#{image},#{sort},#{image1},#{image2},#{image3})")
	Goods goodsinsert(@Param("name")String name,@Param("price")String price,@Param("image")String image,@Param("sort")String sort,
			@Param("image1")String image1,@Param("image2")String image2,@Param("image3")String image3);
	//下架
	@Delete("delete from tb_goods where id=#{id}")
	void removegoods(@Param("id")int id);
	//修改
	@Select(" select * from tb_goods where id=#{id}")
	Goods findid(@Param("id") Integer id);
	@Select("update tb_goods set name=#{name},price=#{price},sort=#{sort} where id=#{id}")
	Goods goodsupdate(@Param("id") Integer id,
		@Param("name") String name,@Param("price") String price,@Param("sort") String sort);
	//库存管理
	@Select("update tb_goods set stock=#{stock} where id=#{id}")
	Goods stockupdate(@Param("id") Integer id,
		@Param("stock") String stock);
}
