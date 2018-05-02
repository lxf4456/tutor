package com.education.tutor.db.mapper;

import com.education.tutor.api.TupleIdValue;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoginMapper {

	@Select("select username from user_main where username = #{username}")
	public String getUserName(@Param("username") String username);

	@Insert("insert into authorities(username, authority) values(#{username}, #{authority})")
	public int insertAuthorities(@Param("username") String username, @Param("authority") String authority);

	@Select("select authority from authorities where username=#{username} union select authority from group_authorities where group_id in (select group_id from group_members where username=#{username})")
	public List<String> getUserAuthorities(@Param("username") String username);

	@Select("select id, group_name as value from groups where id in (select group_id from group_members where username = #{username})")
	public List<TupleIdValue> getRoles(@Param("username") String username);

	@Select("select count(*) as count from user_main")
	public Integer getUserMainTotal();

	@Select("select user_main_id from user_main where partner_no = #{partnerNo}")
	public Long getUserIdBypartnerNo(@Param("partnerNo") String partnerNo);

	@Select("select count(*) as count from rs_partner rp INNER JOIN user_main um on rp.user_main_id = um.user_main_id and um.`partner_level` > 0 where rp.upper_id = #{upperId}")
	public Integer getUpPartnerTotal(@Param("upperId") long upperId);

	
}
