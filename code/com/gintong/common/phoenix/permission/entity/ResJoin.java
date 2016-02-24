package com.gintong.common.phoenix.permission.entity;

import java.util.Date;

public class ResJoin {
    private Long resJoinId;

    private Long resId;

    private Short resType;

    private Long sendUserId;

    private Long receiveObjId;

    private Short receiveObjType;

    private Date perTime;

    public Long getResJoinId() {
        return resJoinId;
    }

    public void setResJoinId(Long resJoinId) {
        this.resJoinId = resJoinId;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public Short getResType() {
        return resType;
    }

    public void setResType(Short resType) {
        this.resType = resType;
    }

    public Long getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Long sendUserId) {
        this.sendUserId = sendUserId;
    }

    public Long getReceiveObjId() {
        return receiveObjId;
    }

    public void setReceiveObjId(Long receiveObjId) {
        this.receiveObjId = receiveObjId;
    }

    public Short getReceiveObjType() {
        return receiveObjType;
    }

    public void setReceiveObjType(Short receiveObjType) {
        this.receiveObjType = receiveObjType;
    }

    public Date getPerTime() {
        return perTime;
    }

    public void setPerTime(Date perTime) {
        this.perTime = perTime;
    }
}