package com.unicom.entity;

public class UserType {
    private Integer userTypeid;

    private String userId;

    private String userTypename;

    public UserType(Integer userTypeid, String userId, String userTypename) {
        this.userTypeid = userTypeid;
        this.userId = userId;
        this.userTypename = userTypename;
    }

    public UserType() {
        super();
    }

    public Integer getUserTypeid() {
        return userTypeid;
    }

    public void setUserTypeid(Integer userTypeid) {
        this.userTypeid = userTypeid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserTypename() {
        return userTypename;
    }

    public void setUserTypename(String userTypename) {
        this.userTypename = userTypename == null ? null : userTypename.trim();
    }
}