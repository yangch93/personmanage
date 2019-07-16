package com.unicom.entity;

public class UserTypeKey {
    private Integer userTypeid;

    private Integer userId;

    public UserTypeKey(Integer userTypeid, Integer userId) {
        this.userTypeid = userTypeid;
        this.userId = userId;
    }

    public UserTypeKey() {
        super();
    }

    public Integer getUserTypeid() {
        return userTypeid;
    }

    public void setUserTypeid(Integer userTypeid) {
        this.userTypeid = userTypeid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}