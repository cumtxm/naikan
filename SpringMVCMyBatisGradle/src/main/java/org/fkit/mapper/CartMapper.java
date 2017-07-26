package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Cart;

public interface CartMapper {
	@Select(" select * from tb_cart where user_id=#{user_id}")
	List<Cart> findAll(@Param("user_id")Integer user_id);
	
	@Select("insert into tb_cart(name,image,price,quantity,user_id,goods_id) values(#{name},#{image},#{price},#{quantity},#{user_id},#{goods_id})")
	Cart insertcart(@Param("name")String name,@Param("image")String image,@Param("price")String price,@Param("quantity")Integer quantity,@Param("user_id")Integer user_id,@Param("goods_id")Integer goods_id);
	
	@Delete("delete from tb_cart where id=#{id}")
	void removecart(@Param("id")int id);

	@Select("select * from tb_cart where user_id = #{user_id} and goods_id = #{goods_id}")
	Cart cartFind(@Param("user_id")Integer user_id,@Param("goods_id") Integer goods_id);
	
	@Select("update tb_cart set quantity=#{quantity}+quantity where user_id=#{user_id} and goods_id=#{goods_id}")
	Cart updatecart(@Param("quantity")Integer quantity,@Param("user_id")Integer user_id,@Param("goods_id")Integer goods_id);
}
