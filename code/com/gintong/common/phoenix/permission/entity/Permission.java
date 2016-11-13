package com.gintong.common.phoenix.permission.entity;

import java.util.Date;

public class Permission {
    private Long perId;

    private Long resId;

    private Short resType;

    private String resAccRule;

    private Long resOwnerId;

    private Integer publicFlag;

    private Integer connectFlag;

    private Integer shareFlag;

    private Date perTime;

    private Long appId;

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

    public Long getResOwnerId() {
        return resOwnerId;
    }

    public void setResOwnerId(Long resOwnerId) {
        this.resOwnerId = resOwnerId;
    }

    public Integer getPublicFlag() {
        return publicFlag;
    }

    public void setPublicFlag(Integer publicFlag) {
        this.publicFlag = publicFlag;
    }

    public Integer getConnectFlag() {
        return connectFlag;
    }

    public void setConnectFlag(Integer connectFlag) {
        this.connectFlag = connectFlag;
    }

    public Integer getShareFlag() {
        return shareFlag;
    }

    public void setShareFlag(Integer shareFlag) {
        this.shareFlag = shareFlag;
    }

    public Date getPerTime() {
        return perTime;
    }

    public void setPerTime(Date perTime) {
        this.perTime = perTime;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}