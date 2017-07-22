package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Cart;

public interface CartMapper {
	@Select(" select * from tb_cart where user_id=#{user_id}")
	List<Cart> findAll(@Param("user_id")Integer user_id);
	
	@Select("insert into tb_cart(name,image,price,quantity,user_id) values(#{name},#{image},#{price},#{quantity},#{user_id})")
	Cart insertcart(@Param("name")String name,@Param("image")String image,@Param("price")String price,@Param("quantity")Integer quantity,@Param("user_id")Integer user_id);
	
	@Delete("delete from tb_cart where id=#{id}")
	void removecart(@Param("id")int id);
}
