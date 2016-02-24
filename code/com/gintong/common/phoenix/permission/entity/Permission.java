package com.gintong.common.phoenix.permission.entity;

import java.util.Date;

public class Permission {
    private Long perId;

    private Long resId;

    private Short resType;

    private String resAccRule;

    private Long sendUserId;

    private Long receiveObjId;

    private Short receiveObjType;

    private Short perType;

    private Date perTime;

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
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

    public String getResAccRule() {
        return resAccRule;
    }

    public void setResAccRule(String resAccRule) {
        this.resAccRule = resAccRule == null ? null : resAccRule.trim();
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

    public Short getPerType() {
        return perType;
    }

    public void setPerType(Short perType) {
        this.perType = perType;
    }

    public Date getPerTime() {
        return perTime;
    }

    public void setPerTime(Date perTime) {
        this.perTime = perTime;
    }
}