package com.unicom.entity;

public class UserWithBLOBs extends User {
    private String userExperience;

    private String userRemark;

    public UserWithBLOBs(Integer userId, String userAccount, String userPassword, String userCode, String userName, String userSex, Date userBirthday, Integer userAge, String userQeducation, String userCompany, String userDepartment, String userPost, Integer userTalentrank, Integer userRank, Integer userPhone, String userEmail, Date userHiredate, String user1, String user2, String user3, String user4, String userQschool, String userQmajor, String userZschool, String userZmajor, String userZeducation, String userExperience, String userRemark) {
        super(userId, userAccount, userPassword, userCode, userName, userSex, userBirthday, userAge, userQeducation, userCompany, userDepartment, userPost, userTalentrank, userRank, userPhone, userEmail, userHiredate, user1, user2, user3, user4, userQschool, userQmajor, userZschool, userZmajor, userZeducation);
        this.userExperience = userExperience;
        this.userRemark = userRemark;
    }

    public UserWithBLOBs() {
        super();
    }

    public String getUserExperience() {
        return userExperience;
    }

    public void setUserExperience(String userExperience) {
        this.userExperience = userExperience == null ? null : userExperience.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }
}