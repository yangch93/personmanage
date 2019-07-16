package com.unicom.entity;

public class Sfmajor {
    private Integer sfmajorId;

    private String talentSfmajor;

    public Sfmajor(Integer sfmajorId, String talentSfmajor) {
        this.sfmajorId = sfmajorId;
        this.talentSfmajor = talentSfmajor;
    }

    public Sfmajor() {
        super();
    }

    public Integer getSfmajorId() {
        return sfmajorId;
    }

    public void setSfmajorId(Integer sfmajorId) {
        this.sfmajorId = sfmajorId;
    }

    public String getTalentSfmajor() {
        return talentSfmajor;
    }

    public void setTalentSfmajor(String talentSfmajor) {
        this.talentSfmajor = talentSfmajor == null ? null : talentSfmajor.trim();
    }
}