package com.education.tutor.api.rong;

import com.education.tutor.api.BaseReq;

import java.util.ArrayList;
import java.util.List;

//发送系统消息
public class SendNoticeReq extends BaseReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> userNames;// 用户账号
	private Integer noticeId;// 消息模板id
	private Integer type;// 消息类型
	private Long id;// 设备或者需求ID
	private String projectName;
	private String content;
	private Long goodsId;//设备id



	public SendNoticeReq(List<String> userNames, Integer noticeId, Long id, Integer type) {
		this.userNames = userNames;
		this.noticeId = noticeId;
		this.type = type;
		this.id = id;
	}

	public SendNoticeReq(String userName, Integer noticeId, Long id, Integer type,Long goodsId) {
		List<String> userIdLt = new ArrayList<>();
		userIdLt.add(userName);
		this.userNames = userIdLt;
		this.noticeId = noticeId;
		this.type = type;
		this.id = id;
		this.goodsId = goodsId;

	}


	public SendNoticeReq(String userName, Integer noticeId, Long id, Integer type) {
		List<String> userIdLt = new ArrayList<>();
		userIdLt.add(userName);
		this.userNames = userIdLt;
		this.noticeId = noticeId;
		this.type = type;
		this.id = id;
	}

	// 通知全部用户
	public SendNoticeReq(String content) {
		this.content = content;
		this.type = 0;
	}

	public SendNoticeReq() {
	}

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getUserNames() {
		return userNames;
	}

	public void setUserNames(List<String> userNames) {
		this.userNames = userNames;
	}


	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

}
