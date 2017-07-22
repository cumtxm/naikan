package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Order;
import org.fkit.domain.OrderItem;

public interface OrderMapper {
	@Select(" select * from tb_order where user_id=#{user_id}")
	List<Order> findAll(@Param("user_id")Integer user_id);
	
	@Select("insert into tb_order(id,payment,status,time,user_id) values(#{id},#{payment},#{status},#{time},#{user_id})")
	Order insertorder(@Param("id")Integer id,@Param("payment")String payment,@Param("status")String status,@Param("time")String time,@Param("user_id")Integer user_id);
	@Delete("delete from tb_order where id=#{id}")
	void removeorder(@Param("id")int id);
	//评论
	@Select(" select * from tb_order where id=#{id}")
	Order findorder(@Param("id") Integer id);
	//订单状态修改
	@Select(" select * from tb_order")
	List<Order> findAll1();
	@Select("update tb_order set status='已发货' where id=#{id}")
	Order updateorder(@Param("id") Integer id);
	@Select("update tb_order set status='已完成' where id=#{id}")
	Order updateorder1(@Param("id") Integer id);
}
