package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.User;

public interface RegisterMapper {
	@Select("insert into tb_user(username,password,password1,email,phone) values(#{username},#{password},#{password1},#{email},#{phone})")
	User insertuser(@Param("username")String username,@Param("password")String password,@Param("password1")String password1,@Param("email")String email,
			@Param("phone")String phone);

}
