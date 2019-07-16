package com.unicom.entity;

public class TalentKey {
    private Integer talentId;

    private Integer userId;

    public TalentKey(Integer talentId, Integer userId) {
        this.talentId = talentId;
        this.userId = userId;
    }

    public TalentKey() {
        super();
    }

    public Integer getTalentId() {
        return talentId;
    }

    public void setTalentId(Integer talentId) {
        this.talentId = talentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}