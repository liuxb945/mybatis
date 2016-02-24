package com.cici.mvn.mybatis.domain;

public class Navi {
    private Integer naviId;

    private String naviName;

    private String appName;

    private String url;

    private String target;

    private Integer status;

    private String position;

    private Integer guest;

    private Integer isAppNavi;

    private Integer parentId;

    private Integer orderSort;

    public Integer getNaviId() {
        return naviId;
    }

    public void setNaviId(Integer naviId) {
        this.naviId = naviId;
    }

    public String getNaviName() {
        return naviName;
    }

    public void setNaviName(String naviName) {
        this.naviName = naviName == null ? null : naviName.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getGuest() {
        return guest;
    }

    public void setGuest(Integer guest) {
        this.guest = guest;
    }

    public Integer getIsAppNavi() {
        return isAppNavi;
    }

    public void setIsAppNavi(Integer isAppNavi) {
        this.isAppNavi = isAppNavi;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderSort() {
        return orderSort;
    }

    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }
}