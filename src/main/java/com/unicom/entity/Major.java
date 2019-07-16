package com.unicom.entity;

public class Major {
    private Integer majorId;

    private String talentMajor;

    public Major(Integer majorId, String talentMajor) {
        this.majorId = majorId;
        this.talentMajor = talentMajor;
    }

    public Major() {
        super();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getTalentMajor() {
        return talentMajor;
    }

    public void setTalentMajor(String talentMajor) {
        this.talentMajor = talentMajor == null ? null : talentMajor.trim();
    }
}