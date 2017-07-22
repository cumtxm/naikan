package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Admin;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String username
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where username = #{username} and password = #{password}")
	User findWithusernameAndPassword(@Param("username")String username,
			@Param("password") String password);
	@Select("update tb_user set password=#{password} where email=#{email}")
	User updatepassword(@Param("email") String email,
			@Param("password") String password);
	@Select("select * from tb_user where username=#{username} and email=#{email}")
	User findpwd1(@Param("username")String username,
			@Param("email") String email);


	@Select("select * from tb_admin where username = #{username} and password = #{password}")
	Admin findadmin(@Param("username")String username,
			@Param("password") String password);
	//订单状态通知
	@Select(" select * from tb_user where id=#{id}")
	User finduser(@Param("id") Integer id);
}

