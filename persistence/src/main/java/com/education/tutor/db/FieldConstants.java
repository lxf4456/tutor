package com.education.tutor.db;

public interface FieldConstants {

    public static enum DEL_FLAG {
        /**
         * alter table
         */
        NOT_DELETED, // 未删除
        DELETED // 删除
    }

    //系统平台

    public static enum PLATFROM{
        DUMMY,ANDROID,IOS,PC,BOSS,WAP
    }

    // account
    public static enum ACCOUNT_GOVTIDTYPE {
        IDCARD, // 身份证
        PASSPORT, // 护照
        OTHER // 其他
    }

    // attachment
    public static enum ATTACHMENT_STATE {
        ENABLED, DISABLED
    }

    public static enum ATTACHMENT_TYPE {
        PRIVATE, PUBLIC
    }

    public static enum ATTACHMENT_OWNER_TYPE {
        LOGO, // 品类型号logo
        HDPIC, // 品类高清图
        TEXTIMG, // 图文内容中图片
        TOPIC, // 话题内容中图片
        SOLUTION, //项目解决方案
        BRAND //品牌
    }

    public static enum CONTRACT_STATE {
        OPEN,    // 合同有效
        CLOSED    // 合同关闭
    }

    public static enum CONTRACT_PAYMENT_STATUS {
        ENABLE,    // 有效
        DISABLE    // 失效
    }
    // message
    public static enum MESSAGE_STATUS {
        NONE_RECEIVED, // 没收到
        RECEIVED, // 收到未读
        READ, // 已读
        DELETED, // 已删
        SEND_SUCC, // 发送成功
        SEND_FAIL, // 发送失败
        RESEND_SUCC, // 重发成功
        RESEND_FAIL // 重发失败
    }

    public static enum MESSAGE_TYPE {
        FRIENDS, // 朋友圈
        CHAT_ROOM, // 群聊
        CHAT, // 单聊
        CHAT_READ_DELETE,// 阅后即焚
        HELP//客服
    }

    // order_main
    public static enum ORDER_MAIN_TYPE {
        FREE, // 免费订单
        CHARGE // 收费订单
    }

    public static enum ORDER_MAIN_STATE {
        OPEN, CLOSE
    }

    public static enum ORDER_MAIN_VOCHER_STATE {
        NONE_VOCHER, // 不需发票
        VOCHER_OPEN, // 发票开具
        VOCHER_REVOKED // 发票冲销
    }

    public static enum ORDER_MAIN_DELIVERY_STATE {
        NONE_DELIVERY, // 不需送货
        ON_THE_WAY, // 在途
        SIGN_FOR_RECEIVE, // 签收完毕
        LOST // 丢失
    }

    // organization
    public static enum ORG_PRIORITY {
        NORMAL, // 正常
        IMPORTANT, // 重要客户
        VIP // VIP客户
    }

    public static enum ORGANIZATION_ORG_STATE {
        EDIT, DISABLED, WAITING, PASS, REJECT
    }


    public static enum SOCIAL_GROUP_STATUS {
        OPEN, // 有效
        REVOKED // 撤销
    }


    public static enum USER_INTERATION_REVOKE_FLAG {
        NOT_REVOKED, // 未撤销
        REVOKED // 用户撤销
    }



    // user_main
    public static enum USER_MAIN_LANG {
        zh, en, ru, es, fr
    }

    public static enum USER_MAIN_GENDER {
        MALE, FEMALE, UNKNWON
    }

    public static enum USER_MAIN_SOURCE {
        SEED, // 种子用户
        INVITED, // 邀请用户
        PROMOTION, // 运营活动拉新用户
        UNKNOWN // 未知
    }

    public static enum USER_MAIN_EDUCATION {
        DOCTOR, // 博士学位
        MASTER, // 硕士学位
        BACHELOR, // 学士学位
        HIGHSCHOOL, // 高中
        OTHER // 其他
    }

    public static enum USER_MAIN_STATUS {
        ENABLED, // 有效
        DISABLED, // 失效
        LOCKED // 锁定
    }

}
