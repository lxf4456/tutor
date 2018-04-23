package com.education.tutor.db.mapper;

import com.education.tutor.api.UserBasic;
import com.education.tutor.api.user.Master;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

	/**
	 * 获取关系集合，筛选某个指定用户与一群用户存在指定类型为interactionType的互动关系，例如返回在这群用户中指定用户关注的人
	 * 
	 * @param userMainId
	 *            指定用户
	 * @param interactionType
	 *            互动类型：如关注
	 * @param targetType
	 * @param revokeFlag
	 * @param userMainIdList
	 *            一群用户
	 * @return
	 */
	@Select("select target_pk from user_interaction ui where ui.user_main_id = #{userMainId}"
			+ " and ui.interaction_type = #{interactionType} and ui.target_type in (${targetType}) and ui.revoke_flag = #{revokeFlag} and ui.target_pk in (${userMainIdList})")
	public List<Long> getRelations(@Param("userMainId") long userMainId, @Param("interactionType") int interactionType,
			@Param("targetType") String targetType, @Param("revokeFlag") int revokeFlag,
			@Param("userMainIdList") String userMainIdList);

	/**
	 *
	 * 根据用户ids 返回usernames
	 * 
	 * @return
	 */
	@Select("select username from user_main where user_main_id in (${userMainIds})")
	public List<String> getUsernames(@Param("userMainIds") String userMainIds);

	/**
	 * 根據角色ID返回用戶名稱列表
	 * 
	 * @param groupId
	 * @return
	 */
	@Select("select um.username from user_main um inner join group_members gm on um.username = gm.username where gm.group_id = #{groupId}")
	public List<String> getUsernameByGroupId(@Param("groupId") Long groupId);



	//给全部用户推送信息
	//查询可以推送消息的用户
	@Select("select username from user_main where length(push_token)>10")
	public List<String> getUserNames();
	
	@Select("select um.user_main_id as userId,um.username as userName,um.nick_name as nickName,um.avatar from groups g inner join group_members gm on g.id = gm.group_id inner join user_main um on um.username = gm.username where g.group_name = '专家'")
	public List<Master> getMasterList();


	@Select("select count(*) as total "
			+ " from `user_interaction` ui , user_main um "
			+ " where ui.`user_main_id`=um.`user_main_id`  and ui.interaction_type = 2  " //and ui.`target_pk` = um.user_main_id and  ui.`target_type` in  (0,8)  
			+ " and ui.revoke_flag=0 and um.`user_main_id` = #{userId}  order by ui.updated_at desc  ")
	public Integer getMyAttentionsCount( @Param("userId") Long userId);
	

	@Select("select count(*) as total "
			+ " from `user_interaction` ui , user_main um "
			+ " where ui.`user_main_id`=um.`user_main_id`  and ui.interaction_type = 2  " //and ui.`target_pk` = um.user_main_id and  ui.`target_type` in  (0,8)  
			+ " and ui.revoke_flag=0 and ui.`target_pk` = #{userId}  order by ui.updated_at desc ")
	public Integer getMyFansCount( @Param("userId") Long userId);
	
	
	@Select("SELECT a.`username` AS userName,a.`nick_name` AS nickName,a.`avatar` AS avatar,a.`user_main_id` AS userId FROM user_main a WHERE a.`user_main_id`= #{userId}")
	public UserBasic getUserById(@Param("userId") Long userId) ;


	
	
	

}
