package io.rong.messages;

import io.rong.util.GsonUtil;

/**
 * Created by 雪峰 on 2017/9/19.
 */
public class GrpNtfMessage extends BaseMessage {
    private String operation = "";
    private String extra = "";
    private String operatorUserId = "";
    private String data="";
    private String message = "";
    private transient static final String TYPE = "RC:GrpNtf";

    public GrpNtfMessage(String operation, String extra, String operatorUserId, String message,String data) {
        this.operation = operation;
        this.extra = extra;
        this.operatorUserId = operatorUserId;
        this.message = message;
        this.data = data;
    }

    public String getType() {
        return TYPE;
    }

    /**
     * 获取操作名。
     *
     * @returnString
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置操作名。
     *
     * @return
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 获取为附加信息(如果开发者自己需要，可以自己在 App 端进行解析)。
     *
     * @returnString
     */
    public String getExtra() {
        return extra;
    }

    /**
     * 设置为附加信息(如果开发者自己需要，可以自己在 App 端进行解析)。
     *
     * @return
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }
    /**
     * 获取请求或者响应消息。
     *
     * @returnString
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置请求或者响应消息。
     *
     * @return
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this, GrpNtfMessage.class);
    }

    public String getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
