package com.unicom.entity;

import java.util.Date;

public class Talent extends TalentKey {
    private String userName;

    private String userCode;

    private Integer talentRank;

    private Date talentHiredate;

    private Date talentQuitdate;

    private String talentMajor;

    private String talentSfmajor;

    private Date talentEnddate;

    private Integer talentPoints;

    private String talentQuitroad;

    private String talentType;

    private Date talentFirstdate;

    private Date talentFirstpoints;

    private Date talentSeconddate;

    private String talentFirstresult;

    private String talentSecondpoints;

    private String talentSecondresult;

    private String talentRemark;

    private String talent1;

    private String talent2;

    private String talent3;

    private String talent4;

    public Talent(Integer talentId, Integer userId, String userName, String userCode, Integer talentRank, Date talentHiredate, Date talentQuitdate, String talentMajor, String talentSfmajor, Date talentEnddate, Integer talentPoints, String talentQuitroad, String talentType, Date talentFirstdate, Date talentFirstpoints, Date talentSeconddate, String talentFirstresult, String talentSecondpoints, String talentSecondresult, String talentRemark, String talent1, String talent2, String talent3, String talent4) {
        super(talentId, userId);
        this.userName = userName;
        this.userCode = userCode;
        this.talentRank = talentRank;
        this.talentHiredate = talentHiredate;
        this.talentQuitdate = talentQuitdate;
        this.talentMajor = talentMajor;
        this.talentSfmajor = talentSfmajor;
        this.talentEnddate = talentEnddate;
        this.talentPoints = talentPoints;
        this.talentQuitroad = talentQuitroad;
        this.talentType = talentType;
        this.talentFirstdate = talentFirstdate;
        this.talentFirstpoints = talentFirstpoints;
        this.talentSeconddate = talentSeconddate;
        this.talentFirstresult = talentFirstresult;
        this.talentSecondpoints = talentSecondpoints;
        this.talentSecondresult = talentSecondresult;
        this.talentRemark = talentRemark;
        this.talent1 = talent1;
        this.talent2 = talent2;
        this.talent3 = talent3;
        this.talent4 = talent4;
    }

    public Talent() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getTalentRank() {
        return talentRank;
    }

    public void setTalentRank(Integer talentRank) {
        this.talentRank = talentRank;
    }

    public Date getTalentHiredate() {
        return talentHiredate;
    }

    public void setTalentHiredate(Date talentHiredate) {
        this.talentHiredate = talentHiredate;
    }

    public Date getTalentQuitdate() {
        return talentQuitdate;
    }

    public void setTalentQuitdate(Date talentQuitdate) {
        this.talentQuitdate = talentQuitdate;
    }

    public String getTalentMajor() {
        return talentMajor;
    }

    public void setTalentMajor(String talentMajor) {
        this.talentMajor = talentMajor == null ? null : talentMajor.trim();
    }

    public String getTalentSfmajor() {
        return talentSfmajor;
    }

    public void setTalentSfmajor(String talentSfmajor) {
        this.talentSfmajor = talentSfmajor == null ? null : talentSfmajor.trim();
    }

    public Date getTalentEnddate() {
        return talentEnddate;
    }

    public void setTalentEnddate(Date talentEnddate) {
        this.talentEnddate = talentEnddate;
    }

    public Integer getTalentPoints() {
        return talentPoints;
    }

    public void setTalentPoints(Integer talentPoints) {
        this.talentPoints = talentPoints;
    }

    public String getTalentQuitroad() {
        return talentQuitroad;
    }

    public void setTalentQuitroad(String talentQuitroad) {
        this.talentQuitroad = talentQuitroad == null ? null : talentQuitroad.trim();
    }

    public String getTalentType() {
        return talentType;
    }

    public void setTalentType(String talentType) {
        this.talentType = talentType == null ? null : talentType.trim();
    }

    public Date getTalentFirstdate() {
        return talentFirstdate;
    }

    public void setTalentFirstdate(Date talentFirstdate) {
        this.talentFirstdate = talentFirstdate;
    }

    public Date getTalentFirstpoints() {
        return talentFirstpoints;
    }

    public void setTalentFirstpoints(Date talentFirstpoints) {
        this.talentFirstpoints = talentFirstpoints;
    }

    public Date getTalentSeconddate() {
        return talentSeconddate;
    }

    public void setTalentSeconddate(Date talentSeconddate) {
        this.talentSeconddate = talentSeconddate;
    }

    public String getTalentFirstresult() {
        return talentFirstresult;
    }

    public void setTalentFirstresult(String talentFirstresult) {
        this.talentFirstresult = talentFirstresult == null ? null : talentFirstresult.trim();
    }

    public String getTalentSecondpoints() {
        return talentSecondpoints;
    }

    public void setTalentSecondpoints(String talentSecondpoints) {
        this.talentSecondpoints = talentSecondpoints == null ? null : talentSecondpoints.trim();
    }

    public String getTalentSecondresult() {
        return talentSecondresult;
    }

    public void setTalentSecondresult(String talentSecondresult) {
        this.talentSecondresult = talentSecondresult == null ? null : talentSecondresult.trim();
    }

    public String getTalentRemark() {
        return talentRemark;
    }

    public void setTalentRemark(String talentRemark) {
        this.talentRemark = talentRemark == null ? null : talentRemark.trim();
    }

    public String getTalent1() {
        return talent1;
    }

    public void setTalent1(String talent1) {
        this.talent1 = talent1 == null ? null : talent1.trim();
    }

    public String getTalent2() {
        return talent2;
    }

    public void setTalent2(String talent2) {
        this.talent2 = talent2 == null ? null : talent2.trim();
    }

    public String getTalent3() {
        return talent3;
    }

    public void setTalent3(String talent3) {
        this.talent3 = talent3 == null ? null : talent3.trim();
    }

    public String getTalent4() {
        return talent4;
    }

    public void setTalent4(String talent4) {
        this.talent4 = talent4 == null ? null : talent4.trim();
    }
}