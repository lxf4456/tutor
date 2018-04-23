package com.education.tutor.api.rong;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2017/8/25.
 */
public class SysMessage implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer type;// 消息类型
    private Long id;// 设备或者需求ID
    private Integer flag;//标识（0:不处理，1：我查看 2：审核人员查看）
    private String goodsId;//设备id

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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}
