package com.gintong.common.phoenix.permission.entity;

public class ResShareLink {
    private Long shareLinkId;

    private Long resId;

    private Short resType;

    private Long linkCreateTime;

    private Integer random;

    private String encreyptStr;

    public Long getShareLinkId() {
        return shareLinkId;
    }

    public void setShareLinkId(Long shareLinkId) {
        this.shareLinkId = shareLinkId;
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

    public Long getLinkCreateTime() {
        return linkCreateTime;
    }

    public void setLinkCreateTime(Long linkCreateTime) {
        this.linkCreateTime = linkCreateTime;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public String getEncreyptStr() {
        return encreyptStr;
    }

    public void setEncreyptStr(String encreyptStr) {
        this.encreyptStr = encreyptStr == null ? null : encreyptStr.trim();
    }
}