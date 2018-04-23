package com.education.tutor.service;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.rong.RongCloud;
import io.rong.messages.BaseMessage;
import io.rong.messages.TxtMessage;
import io.rong.models.ChatRoomInfo;
import io.rong.models.ChatroomQueryResult;
import io.rong.models.ChatroomUserQueryResult;
import io.rong.models.CheckOnlineResult;
import io.rong.models.CodeSuccessResult;
import io.rong.models.GroupInfo;
import io.rong.models.GroupUserQueryResult;
import io.rong.models.HistoryMessageResult;
import io.rong.models.ListBlockChatroomUserResult;
import io.rong.models.ListGagChatroomUserResult;
import io.rong.models.ListGagGroupUserResult;
import io.rong.models.ListWordfilterResult;
import io.rong.models.PushMessage;
import io.rong.models.QueryBlacklistUserResult;
import io.rong.models.QueryBlockUserResult;
import io.rong.models.SMSImageCodeResult;
import io.rong.models.SMSSendCodeResult;
import io.rong.models.SMSVerifyCodeResult;
import io.rong.models.TemplateMessage;
import io.rong.models.TokenResult;
import io.rong.models.UserTag;

@Service
public class ImRongService {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Value("${im.appkey}")
	String appKey;

	@Value("${im.appsecret}")
	String appSecret;

	RongCloud rongCloud;

	@PostConstruct
	public void init() {
		logger.info("appKey=" + appKey + ", appSecret=" + appSecret);
		rongCloud = RongCloud.getInstance(appKey, appSecret);
	}

	/**
	 * 获取 Token
	 * @param userId
	 *            用户id
	 * @param userName
	 *            用户姓名
	 * @param logoUrl
	 *            logo图片路径
	 * @return 
	 * @throws Exception
	 */
	public TokenResult getTokenResult(String userId, String userName, String logoUrl) throws Exception {
		return rongCloud.user.getToken(userId, userName, logoUrl);
	}

	/**
	 * 刷新用户信息方法
	 * @param userId
	 *            用户id
	 * @param userName
	 *            用户姓名
	 * @param logoUrl
	 *            logo图片路径
	 * @return 
	 * @throws Exception
	 */
	public CodeSuccessResult refreshUserInfo(String userId, String userName, String logoUrl) throws Exception {
		return rongCloud.user.refresh(userId, userName, logoUrl);
	}

	/**
	 * 检查用户状态
	 * @param userId
	 * @return 
	 * @throws Exception
	 */
	public CheckOnlineResult checkOnlineResult(String userId) throws Exception {
		return rongCloud.user.checkOnline(userId);

	}

	/**
	 * 返回封禁结果
	 * @param userId
	 *            用户id
	 * @param minute
	 *            封禁分钟数
	 * @return 
	 * @throws Exception
	 */
	public CodeSuccessResult userBlockResult(String userId, Integer minute) throws Exception {
		return rongCloud.user.block(userId, minute);
	}

	/**
	 * 返回解禁结果
	 * @param userId
	 *            用户id
	 * @return 
	 * @throws Exception
	 */
	public CodeSuccessResult userUnBlockResult(String userId) throws Exception {
		return rongCloud.user.unBlock(userId);
	}

	/**
	 * 查询被封禁用户
	 * @return 
	 * @throws Exception
	 */
	public QueryBlockUserResult userQueryBlockResult() throws Exception {
		return rongCloud.user.queryBlock();
	}

	/**
	 * 添加用户到黑名单方法
	 * @param userId
	 *            用户id
	 * @param blackUserId
	 *            被拉黑用户id
	 * @return 
	 * @throws Exception
	 */
	public CodeSuccessResult userAddBlacklistResult(String userId, String blackUserId) throws Exception {
		return rongCloud.user.addBlacklist(userId, blackUserId);
	}

	/**
	 * 获取某用户的黑名单列表方法
	 * @param userId
	 * @return 
	 * @throws Exception
	 */
	public QueryBlacklistUserResult userQueryBlacklistResult(String userId) throws Exception {
		return rongCloud.user.queryBlacklist("userId1");
	}

	/**
	 * 从黑名单中移除用户方法
	 * @param userId1
	 * @param blackUserId:被移除的用户Id
	 * @return 
	 * @throws Exception
	 */
	public CodeSuccessResult userRemoveBlacklistResult(String userId, String blackUserId) throws Exception {
		return rongCloud.user.removeBlacklist(userId, blackUserId);
	}

	/**
	 * 送单聊消息方法（一个用户向另外一个用户发送消息，单条消息最大 128k。每分钟最多发送 6000 条信息，每次发送用户上限为 1000
	 * 人，如：一次发送 1000 人时，示为 1000 条消息。）
	 * 
	 * @param fromUserId:发送人用户
	 *            Id
	 * @param toUserId:接收用户
	 *            Id，可以实现向多人发送消息，每次上限为 1000 人。（必传）
	 * @param userId
	 * @param voiceMessage:消息。
	 * @param pushContent:定义显示的
	 *            Push 内容，如果 objectName 为融云内置消息类型时，则发送后用户一定会收到 Push
	 *            信息。如果为自定义消息，则 pushContent 为自定义消息显示的 Push 内容，如果不传则用户不会收到 Push
	 *            通知。（可选）
	 * @param pushData:针对
	 *            iOS 平台为 Push 通知时附加到 payload 中，Android 客户端收到推送消息时对应字段名为
	 *            pushData。（可选）
	 * @param count:针对
	 *            iOS 平台，Push 时用来控制未读消息显示数，只有在 toUserId 为一个用户 Id 的时候有效。（可选）
	 * @param verifyBlacklist:是否过滤发送人黑名单列表，0
	 *            表示为不过滤、 1 表示为过滤，默认为 0 不过滤。（可选）
	 * @param isPersisted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行存储，0
	 *            表示为不存储、 1 表示为存储，默认为 1 存储消息。（可选）
	 * @param isCounted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行未读消息计数，0
	 *            表示为不计数、 1 表示为计数，默认为 1 计数，未读消息数增加 1。（可选）
	 * @param isIncludeSender:发送用户自已是否接收消息，0
	 *            表示为不接收，1 表示为接收，默认为 0 不接收。（可选）
	 *
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishPrivateResult(String fromUserId, String[] toUserId,
			BaseMessage message, String pushContent, String pushData, String count, Integer verifyBlacklist,
			Integer isPersisted, Integer isCounted, Integer isIncludeSender) throws Exception {
		return rongCloud.message.publishPrivate(fromUserId, toUserId, message, pushContent, pushData, count,
				verifyBlacklist, isPersisted, isCounted, isIncludeSender);
	}

	/**
	 * 发送单聊模板消息方法（一个用户向多个用户发送不同消息内容，单条消息最大 128k。每分钟最多发送 6000 条信息，每次发送用户上限为 1000
	 * 人。
	 * 
	 * @param publishTemplateTemplateMessage:单聊模版消息。
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishTemplateResult(TemplateMessage publishTemplateTemplateMessage)
			throws Exception {
		return rongCloud.message.publishTemplate(publishTemplateTemplateMessage);
	}

	/**
	 * * 发送系统消息方法（一个用户向一个或多个用户发送系统消息，单条消息最大 128k，会话类型为 SYSTEM。每秒钟最多发送 100
	 * 条消息，每次最多同时向 100 人发送，如：一次发送 100 人时，示为 100 条消息。）
	 * 
	 * @param userId
	 * @param toUserId:接收用户
	 *            Id，提供多个本参数可以实现向多人发送消息，上限为 1000 人。（必传）
	 * @param txtMessage:发送消息内容（必传）
	 * @param pushContent:如果为自定义消息，定义显示的
	 *            Push 内容，内容中定义标识通过 values 中设置的标识位内容进行替换.如消息类型为自定义不需要 Push
	 *            通知，则对应数组传空值即可。（可选）
	 * @param pushData:针对
	 *            iOS 平台为 Push 通知时附加到 payload 中，Android 客户端收到推送消息时对应字段名为
	 *            pushData。如不需要 Push 功能对应数组传空值即可。（可选）
	 * @param isPersisted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行存储，0
	 *            表示为不存储、 1 表示为存储，默认为 1 存储消息。（可选）
	 * @param isCounted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行未读消息计数，0
	 *            表示为不计数、 1 表示为计数，默认为 1 计数，未读消息数增加 1。（可选）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishSystemResult(String userId, String[] toUserId, BaseMessage message,
			String pushContent, String pushData, Integer isPersisted, Integer isCounted) throws Exception {
		return rongCloud.message.PublishSystem(userId, toUserId, message, pushContent, pushData, isPersisted,
				isCounted);
	}

	/**
	 * 发送系统模板消息方法（一个用户向一个或多个用户发送系统消息，单条消息最大 128k，会话类型为 SYSTEM.每秒钟最多发送 100
	 * 条消息，每次最多同时向 100 人发送，如：一次发送 100 人时，示为 100 条消息。）
	 * 
	 * @param publishTemplateTemplateMessage:系统模版消息。
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishSystemTemplateResult(TemplateMessage publishTemplateTemplateMessage)
			throws Exception {
		return rongCloud.message.publishSystemTemplate(publishTemplateTemplateMessage);

	}

	/**
	 * 发送群组消息方法（以一个用户身份向群组发送消息，单条消息最大 128k.每秒钟最多发送 20 条消息，每次最多向 3 个群组发送，如：一次向 3
	 * 个群组发送消息，示为 3 条消息。）
	 * 
	 * @param userId
	 * @param toGroupId:接收群Id，提供多个本参数可以实现向多群发送消息，最多不超过
	 *            3 个群组。（必传）
	 * @param txtMessage:发送消息内容（必传）
	 * @param pushContent:定义显示的
	 *            Push 内容，如果 objectName 为融云内置消息类型时，则发送后用户一定会收到 Push 信息.
	 *            如果为自定义消息，则 pushContent 为自定义消息显示的 Push 内容，如果不传则用户不会收到 Push
	 *            通知。（可选）
	 * @param pushData:针对
	 *            iOS 平台为 Push 通知时附加到 payload 中，Android 客户端收到推送消息时对应字段名为
	 *            pushData。（可选）
	 * @param isPersisted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行存储，0
	 *            表示为不存储、 1 表示为存储，默认为 1 存储消息。（可选）
	 * @param isCounted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行未读消息计数，0
	 *            表示为不计数、 1 表示为计数，默认为 1 计数，未读消息数增加 1。（可选）
	 * @param isIncludeSender:发送用户自已是否接收消息，0
	 *            表示为不接收，1 表示为接收，默认为 0 不接收。（可选）
	 *
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishGroupResult(String userId, String[] toGroupId,
			BaseMessage messagePublishGroupTxtMessage, String pushContent, String pushData, Integer isPersisted,
			Integer isCounted, Integer isIncludeSender) throws Exception {
		return rongCloud.message.publishGroup(userId, toGroupId, messagePublishGroupTxtMessage, pushContent, pushData,
				isPersisted, isCounted, isIncludeSender);
	}

	/**
	 * @param fromUserId:发送人用户
	 *            Id。（必传）
	 * @param toDiscussionId:接收讨论组
	 *            Id。（必传）
	 * @param txtMessage:发送消息内容（必传）
	 * @param pushContent:定义显示的
	 *            Push 内容，如果 objectName 为融云内置消息类型时，则发送后用户一定会收到 Push 信息.
	 *            如果为自定义消息，则 pushContent 为自定义消息显示的 Push 内容，如果不传则用户不会收到 Push
	 *            通知。（可选）
	 * @param pushData:针对
	 *            iOS 平台为 Push 通知时附加到 payload 中，Android 客户端收到推送消息时对应字段名为
	 *            pushData.（可选）
	 * @param isPersisted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行存储，0
	 *            表示为不存储、 1 表示为存储，默认为 1 存储消息.（可选）
	 * @param isCounted:当前版本有新的自定义消息，而老版本没有该自定义消息时，老版本客户端收到消息后是否进行未读消息计数，0
	 *            表示为不计数、 1 表示为计数，默认为 1 计数，未读消息数增加 1。（可选）
	 * @param isIncludeSender:发送用户自已是否接收消息，0
	 *            表示为不接收，1 表示为接收，默认为 0 不接收。（可选）
	 * 
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishDiscussionResult(String userId, String toDiscussionId,
			TxtMessage messagePublishGroupTxtMessage, String pushContent, String pushData, Integer isPersisted,
			Integer isCounted, Integer isIncludeSender) throws Exception {
		return rongCloud.message.publishDiscussion(userId, toDiscussionId, messagePublishGroupTxtMessage, pushContent,
				pushData, isPersisted, isCounted, isIncludeSender);
	}

	/**
	 * 发送聊天室消息方法（一个用户向聊天室发送消息，单条消息最大 128k。每秒钟限 100 次。）
	 * 
	 * @param userId
	 * @param messagePublishChatroomToChatroomId:接收聊天室Id，提供多个本参数可以实现向多个聊天室发送消息。（必传）
	 * @param messagePublishChatroomTxtMessage:发送消息内容（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messagePublishChatroomResult(String userId, String[] messagePublishChatroomToChatroomId,
			TxtMessage messagePublishChatroomTxtMessage) throws Exception {
		return rongCloud.message.publishChatroom(userId, messagePublishChatroomToChatroomId,
				messagePublishChatroomTxtMessage);
	}

	/**
	 * 发送广播消息方法（发送消息给一个应用下的所有注册用户，如用户未在线会对满足条件（绑定手机终端）的用户发送 Push 信息，单条消息最大
	 * 128k，会话类型为 SYSTEM。每小时只能发送 1 次，每天最多发送 3 次。）
	 * 
	 * @param userId
	 * @param messageBroadcastTxtMessage
	 *            文本消息
	 * @param pushContent:定义显示的
	 *            Push 内容，如果 objectName 为融云内置消息类型时，则发送后用户一定会收到 Push 信息.
	 *            如果为自定义消息，则 pushContent 为自定义消息显示的 Push 内容，如果不传则用户不会收到 Push
	 *            通知.（可选）
	 * @param pushData:针对
	 *            iOS 平台为 Push 通知时附加到 payload 中，Android 客户端收到推送消息时对应字段名为
	 *            pushData。（可选）
	 * @param os:针对操作系统发送
	 *            Push，值为 iOS 表示对 iOS 手机用户发送 Push ,为 Android 时表示对 Android 手机用户发送
	 *            Push ，如对所有用户发送 Push 信息，则不需要传 os 参数。（可选）
	 *
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messageBroadcastResult(String userId, TxtMessage messageBroadcastTxtMessage,
			String pushContent, String pushData, String os) throws Exception {
		return rongCloud.message.broadcast("userId1", messageBroadcastTxtMessage, pushContent, pushData, os);
	}

	/**
	 * * 消息历史记录下载地址获取 方法消息历史记录下载地址获取方法。获取 APP
	 * 内指定某天某小时内的所有会话消息记录的下载地址。（目前支持二人会话、讨论组、群组、聊天室、客服、系统通知消息历史记录下载）
	 * 
	 * @param date:指定北京时间某天某小时，格式为2014010101,表示：2014年1月1日凌晨1点。（必传）
	 * @return
	 * @throws Exception
	 */
	public HistoryMessageResult messageGetHistoryResult(String date) throws Exception {
		return rongCloud.message.getHistory(date);
	}

	/**
	 * 消息历史记录删除方法（删除 APP
	 * 内指定某天某小时内的所有会话消息记录。调用该接口返回成功后，date参数指定的某小时的消息记录文件将在随后的5-10分钟内被永久删除。）
	 * 
	 * @param date:指定北京时间某天某小时，格式为2014010101,表示：2014年1月1日凌晨1点。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult messageDeleteMessageResult(String date) throws Exception {
		return rongCloud.message.deleteMessage(date);
	}

	/**
	 * 添加敏感词方法（设置敏感词后，App 中用户不会收到含有敏感词的消息内容，默认最多设置 50 个敏感词。）
	 * 
	 * @param word:敏感词，最长不超过
	 *            32 个字符。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult wordfilterAddResult(String word) throws Exception {
		return rongCloud.wordfilter.add(word);
	}

	/**
	 * 查询敏感词列表方法
	 * 
	 * @return
	 * @throws Exception
	 */
	public ListWordfilterResult wordfilterGetListResult() throws Exception {
		return rongCloud.wordfilter.getList();
	}

	/**
	 * 移除敏感词方法（从敏感词列表中，移除某一敏感词。）
	 * 
	 * @param word
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult wordfilterDeleteResult(String word) throws Exception {
		return rongCloud.wordfilter.delete(word);
	}

	/**
	 * 创建群组方法（创建群组，并将用户加入该群组，用户将可以收到该群的消息，同一用户最多可加入 500 个群，每个群最大至 3000 人，App
	 * 内的群组数量没有限制.注：其实本方法是加入群组方法 /group/join 的别名。）
	 * 
	 * @param groupCreateUserId
	 * @param groupId
	 * @param groupName
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupCreateResult(String[] groupCreateUserId, String groupId, String groupName)
			throws Exception {
		return rongCloud.group.create(groupCreateUserId, groupId, groupName);
	}

	/**
	 * 同步用户所属群组方法（当第一次连接融云服务器时，需要向融云服务器提交 userId
	 * 对应的用户当前所加入的所有群组，此接口主要为防止应用中用户群信息同融云已知的用户所属群信息不同步。）
	 * 
	 * @param userId:被同步群信息的用户
	 *            Id。（必传）
	 * @param groupSyncGroupInfo:该用户的群信息，如群
	 *            Id 已经存在，则不会刷新对应群组名称，如果想刷新群组名称请调用刷新群组信息方法。
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupSyncResult(String userId, GroupInfo[] groupSyncGroupInfo) throws Exception {
		return rongCloud.group.sync(userId, groupSyncGroupInfo);
	}

	/**
	 * 刷新群组信息方法
	 * 
	 * @param groupId:群组
	 *            Id。（必传）
	 * @param groupName:群名称。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupRefreshResult(String groupId, String newGroupName) throws Exception {
		return rongCloud.group.refresh(groupId, newGroupName);
	}

	/**
	 * 将用户加入指定群组，用户将可以收到该群的消息，同一用户最多可加入 500 个群，每个群最大至 3000 人。
	 * 
	 * @param userId:要加入群的用户
	 *            Id，可提交多个，最多不超过 1000 个。（必传）
	 * @param groupId:要加入的群
	 *            Id。（必传）
	 * @param groupName:要加入的群
	 *            Id 对应的名称。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupJoinResult(String[] groupJoinUserId, String groupId, String groupName)
			throws Exception {
		return rongCloud.group.join(groupJoinUserId, groupId, groupName);
	}

	/**
	 * 查询群成员方法
	 * 
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public GroupUserQueryResult groupQueryUserResult(String groupId) throws Exception {
		return rongCloud.group.queryUser(groupId);
	}

	/**
	 * 退出群组方法（将用户从群中移除，不再接收该群组的消息.）
	 * 
	 * @param groupQuitUserId:要退出群的用户
	 *            Id.（必传）
	 * @param groupId:要退出的群
	 *            Id.（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupQuitResult(String[] groupQuitUserId, String groupId) throws Exception {
		return rongCloud.group.quit(groupQuitUserId, groupId);
	}

	/**
	 * 添加禁言群成员方法（在 App
	 * 中如果不想让某一用户在群中发言时，可将此用户在群组中禁言，被禁言用户可以接收查看群组中用户聊天信息，但不能发送消息。）
	 * 
	 * @param userId:用户
	 *            Id。（必传）
	 * @param groupId:群组
	 *            Id。（必传）
	 * @param minute:禁言时长，以分钟为单位，最大值为43200分钟。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupAddGagUserResult(String userId, String groupId, String minute) throws Exception {
		return rongCloud.group.addGagUser(userId, groupId, minute);
	}

	/**
	 * 查询被禁言群成员方法
	 * 
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public ListGagGroupUserResult groupLisGagUserResult(String groupId) throws Exception {
		return rongCloud.group.lisGagUser(groupId);
	}

	/**
	 * 移除禁言群成员方法
	 * 
	 * @param userId:用户Id。支持同时移除多个群成员（必传）
	 * @param groupId:群组Id。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupRollBackGagUserResult(String[] userId, String groupId) throws Exception {
		return rongCloud.group.rollBackGagUser(userId, groupId);
	}

	/**
	 * 解散群组方法。（将该群解散，所有用户都无法再接收该群的消息。）
	 * 
	 * @param userId:操作解散群的用户
	 *            Id。（必传）
	 * @param groupId:要解散的群
	 *            Id。（必传）
	 *
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult groupDismissResult(String userId, String groupId) throws Exception {
		return rongCloud.group.dismiss(userId, groupId);
	}

	/**
	 * 创建聊天室方法
	 * 
	 * @param chatroomCreateChatRoomInfo:要创建的聊天室的id；name:要创建的聊天室的name。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomCreateResult(ChatRoomInfo[] chatroomCreateChatRoomInfo) throws Exception {
		return rongCloud.chatroom.create(chatroomCreateChatRoomInfo);
	}

	/**
	 * 加入聊天室
	 * 
	 * @param userId:要加入聊天室的用户
	 *            Id，可提交多个，最多不超过 50 个。（必传）
	 * @param chatroomId:要加入的聊天室
	 *            Id。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomJoinResult(String[] userId, String chatroomId) throws Exception {
		return rongCloud.chatroom.join(userId, chatroomId);
	}

	/**
	 * 查询聊天室信息方法
	 * 
	 * @param chatroomId:要查询的聊天室id（必传）
	 * @return
	 * @throws Exception
	 */
	public ChatroomQueryResult chatroomQueryResult(String[] chatroomId) throws Exception {
		return rongCloud.chatroom.query(chatroomId);
	}

	/**
	 * 查询聊天室内用户方法
	 * 
	 * @param chatroomId:要查询的聊天室
	 *            ID。（必传）
	 * @param count:要获取的聊天室成员数，上限为
	 *            500 ，超过 500 时最多返回 500 个成员。（必传）
	 * @param order:加入聊天室的先后顺序，
	 *            1 为加入时间正序， 2 为加入时间倒序。（必传）
	 * @return
	 * @throws Exception
	 */
	public ChatroomUserQueryResult chatroomQueryUserResult(String chatroomId, String count, String order)
			throws Exception {
		return rongCloud.chatroom.queryUser(chatroomId, count, order);
	}

	/**
	 * 聊天室消息停止分发方法（可实现控制对聊天室中消息是否进行分发，停止分发后聊天室中用户发送的消息，融云服务端不会再将消息发送给聊天室中其他用户。）
	 * 
	 * @param chatroomId:聊天室
	 *            Id。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomStopDistributionMessageResult(String chatroomId) throws Exception {
		return rongCloud.chatroom.stopDistributionMessage("chatroomId1");
	}

	/**
	 * 聊天室消息恢复分发方法
	 * 
	 * @param chatroomId:聊天室
	 *            Id。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomResumeDistributionMessageResult(String chatroomId) throws Exception {
		return rongCloud.chatroom.resumeDistributionMessage(chatroomId);
	}

	/**
	 * 添加禁言聊天室成员方法（在 App
	 * 中如果不想让某一用户在聊天室中发言时，可将此用户在聊天室中禁言，被禁言用户可以接收查看聊天室中用户聊天信息，但不能发送消息.）
	 * 
	 * @param userId:用户
	 *            Id。（必传）
	 * @param chatroomId:聊天室
	 *            Id。（必传）
	 * @param minute:禁言时长，以分钟为单位，最大值为43200分钟。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomAddGagUserResult(String userId, String chatroomId, String minute)
			throws Exception {
		return rongCloud.chatroom.addGagUser(userId, chatroomId, minute);
	}

	/**
	 * 查询被禁言聊天室成员方法
	 * 
	 * @param chatroomId:聊天室
	 *            Id。（必传）
	 * @return
	 * @throws Exception
	 */
	public ListGagChatroomUserResult chatroomListGagUserResult(String chatroomId) throws Exception {
		return rongCloud.chatroom.ListGagUser(chatroomId);
	}

	/**
	 * 移除禁言聊天室成员方法
	 * 
	 * @param userId:用户
	 *            Id。（必传）
	 * @param chatroomId:聊天室Id。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomRollbackGagUserResult(String userId, String chatroomId) throws Exception {
		return rongCloud.chatroom.rollbackGagUser(userId, chatroomId);
	}

	/**
	 * 添加封禁聊天室成员方法
	 * 
	 * @param userId:用户
	 *            Id。（必传）
	 * @param chatroomId:聊天室
	 *            Id。（必传）
	 * @param minute:封禁时长，以分钟为单位，最大值为43200分钟。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomAddBlockUserResult(String userId, String chatroomId, String minute)
			throws Exception {
		return rongCloud.chatroom.addBlockUser(userId, chatroomId, minute);
	}

	/**
	 * 查询被封禁聊天室成员方法
	 * 
	 * @param chatroomId
	 * @return
	 * @throws Exception
	 */
	public ListBlockChatroomUserResult chatroomGetListBlockUserResult(String chatroomId) throws Exception {
		return rongCloud.chatroom.getListBlockUser(chatroomId);
	}

	/**
	 * 移除封禁聊天室成员方法
	 * 
	 * @param userId
	 * @param chatroomId
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomRollbackBlockUserResult(String userId, String chatroomId) throws Exception {
		return rongCloud.chatroom.rollbackBlockUser(userId, chatroomId);
	}

	/**
	 * 添加聊天室消息优先级方法
	 * 
	 * @param chatroomAddPriorityObjectName:低优先级的消息类型，每次最多提交
	 *            5 个，设置的消息类型最多不超过 20 个。（必传）
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomAddPriorityResult(String[] chatroomAddPriorityObjectName) throws Exception {
		return rongCloud.chatroom.addPriority(chatroomAddPriorityObjectName);
	}

	/**
	 * 销毁聊天室方法
	 * 
	 * @param chatroomDestroyChatroomId
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomDestroyResult(String[] chatroomDestroyChatroomId) throws Exception {
		return rongCloud.chatroom.destroy(chatroomDestroyChatroomId);
	}

	/**
	 * 添加聊天室白名单成员方法
	 * 
	 * @param chatroomAddWhiteListUserUserId:聊天室中用户
	 *            Id，可提交多个，聊天室中白名单用户最多不超过 5 个。（必传）
	 * @param chatroomId:聊天室
	 *            Id。
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult chatroomAddWhiteListUserResult(String[] chatroomAddWhiteListUserUserId, String chatroomId)
			throws Exception {
		return rongCloud.chatroom.addWhiteListUser(chatroomId, chatroomAddWhiteListUserUserId);
	}

	/**
	 * 添加 Push 标签方法
	 * 
	 * @param setUserPushTagUserTag:用户标签
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult pushSetUserPushTagResult(UserTag setUserPushTagUserTag) throws Exception {
		return rongCloud.push.setUserPushTag(setUserPushTagUserTag);
	}

	/**
	 * 广播消息方法（fromuserid 和 message为null即为不落地的push）
	 * 
	 * @param broadcastPushPushMessage:json数据
	 * @return
	 * @throws Exception
	 */
	public CodeSuccessResult pushBroadcastPushResult(PushMessage broadcastPushPushMessage) throws Exception {
		return rongCloud.push.broadcastPush(broadcastPushPushMessage);
	}

	/**
	 * 获取图片验证码方法
	 * 
	 * @param appKey:应用Id
	 * @return
	 * @throws Exception
	 */
	public SMSImageCodeResult sMSGetImageCodeResult(String appKey) throws Exception {
		return rongCloud.sms.getImageCode(appKey);
	}

	/**
	 * 发送短信验证码方法。
	 * 
	 * @param mobile:接收短信验证码的目标手机号，每分钟同一手机号只能发送一次短信验证码，同一手机号
	 *            1 小时内最多发送 3 次。（必传）
	 * @param templateId:短信模板
	 *            Id，在开发者后台->短信服务->服务设置->短信模版中获取。（必传）
	 * @param region:手机号码所属国家区号，目前只支持中图区号
	 *            86）
	 * @param verifyId:图片验证标识
	 *            Id ，开启图片验证功能后此参数必传，否则可以不传。在获取图片验证码方法返回值中获取。
	 * @param verifyCode:图片验证码，开启图片验证功能后此参数必传，否则可以不传。
	 * @return
	 * @throws Exception
	 */
	public SMSSendCodeResult sMSSendCodeResult(String mobile, String templateId, String region, String verifyId,
			String verifyCode) throws Exception {
		return rongCloud.sms.sendCode(mobile, templateId, region, verifyId, verifyCode);
	}

	/**
	 * 验证码验证方法
	 * 
	 * @param sessionId:短信验证码唯一标识，在发送短信验证码方法，返回值中获取。（必传）
	 * @param code:短信验证码内容。（必传）
	 * @return
	 * @throws Exception
	 */
	public SMSVerifyCodeResult sMSVerifyCodeResult(String sessionId, String code) throws Exception {
		return rongCloud.sms.verifyCode(sessionId, code);
	}

}
