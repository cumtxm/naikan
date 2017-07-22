package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Comment;

public interface CommentMapper {
	@Select("insert into tb_comment(order_id,logistics,quality,service,picture,comment) values(#{order_id},#{logistics},"
			+ "#{quality},#{service},#{picture},#{comment})")
	Comment insertcomment(@Param("order_id")Integer order_id,@Param("logistics")Integer logistics,
			@Param("quality")Integer quality,@Param("service")Integer service,@Param("picture")String picture,@Param("comment")String comment);
	@Select(" select * from tb_comment")
	List<Comment> findAll();
}
