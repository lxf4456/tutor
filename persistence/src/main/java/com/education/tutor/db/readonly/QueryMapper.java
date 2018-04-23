package com.education.tutor.db.readonly;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface QueryMapper {
	
	@Select("select authority from authorities where username = #{username}")
	public List<String> queryAuthority(String username);

	@Insert("insert into authorities(username, authority) values(#{param1}, #{param2})")
	public int insertAuthorities(String username, String authority);
}
