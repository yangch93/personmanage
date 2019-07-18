package com.unicom.entity;

public class Rank {
    private Integer rankId;

    private String talentRank;

    public Rank(Integer rankId, String talentRank) {
        this.rankId = rankId;
        this.talentRank = talentRank;
    }

    public Rank() {
        super();
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getTalentRank() {
        return talentRank;
    }

    public void setTalentRank(String talentRank) {
        this.talentRank = talentRank == null ? null : talentRank.trim();
    }
}