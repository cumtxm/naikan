package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.OrderItem;

public interface OrderItemMapper {
	@Select(" select * from tb_orderitem where order_id=#{order_id}")
	List<OrderItem> findAll(@Param("order_id")Integer order_id);

}
