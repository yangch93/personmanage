package com.unicom.entity;

public class Rank {
    private Integer rankId;

    private Integer talentRank;

    public Rank(Integer rankId, Integer talentRank) {
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

    public Integer getTalentRank() {
        return talentRank;
    }

    public void setTalentRank(Integer talentRank) {
        this.talentRank = talentRank;
    }
}