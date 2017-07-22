package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Collect;

public interface CollectMapper {
	@Select(" select * from tb_collect where user_id=#{user_id}")
	List<Collect> findAll(@Param("user_id")Integer user_id);
	
	@Select("insert into tb_collect(name,image,price,user_id,goods_id) values(#{name},#{image},#{price},#{user_id},#{goods_id})")
	Collect insertcollect(@Param("name")String name,@Param("image")String image,@Param("price")String price,@Param("user_id")Integer user_id,@Param("goods_id")Integer goods_id);
	
	//不可重复
	@Select("select * from tb_collect where user_id = #{user_id} and goods_id = #{goods_id}")
	Collect collectFind(@Param("user_id")Integer user_id,@Param("goods_id") Integer goods_id);
	
	@Delete("delete from tb_collect where id=#{id}")
	void removecollect(@Param("id")int id);
	
}
