package com.unicom.entity;

public class UserType extends UserTypeKey {
    private String userTypename;

    public UserType(Integer userTypeid, Integer userId, String userTypename) {
        super(userTypeid, userId);
        this.userTypename = userTypename;
    }

    public UserType() {
        super();
    }

    public String getUserTypename() {
        return userTypename;
    }

    public void setUserTypename(String userTypename) {
        this.userTypename = userTypename == null ? null : userTypename.trim();
    }
}