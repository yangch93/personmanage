package com.unicom.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String userAccount;

    private String userPassword;

    private String userCode;

    private String userName;

    private String userSex;

    private Date userBirthday;

    private Integer userAge;

    private String userQeducation;

    private String userCompany;

    private String userDepartment;

    private String userPost;

    private Integer userTalentrank;

    private Integer userRank;

    private String userPhone;

    private String userEmail;

    private Date userHiredate;

    private String userExperience;

    private String userRemark;

    private String user1;

    private String user2;

    private String user3;

    private String user4;

    private String userQschool;

    private String userQmajor;

    private String userZschool;

    private String userZmajor;

    private String userZeducation;

    public User(Integer userId, String userAccount, String userPassword, String userCode, String userName, String userSex, Date userBirthday, Integer userAge, String userQeducation, String userCompany, String userDepartment, String userPost, Integer userTalentrank, Integer userRank, String userPhone, String userEmail, Date userHiredate, String userExperience, String userRemark, String user1, String user2, String user3, String user4, String userQschool, String userQmajor, String userZschool, String userZmajor, String userZeducation) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userCode = userCode;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userQeducation = userQeducation;
        this.userCompany = userCompany;
        this.userDepartment = userDepartment;
        this.userPost = userPost;
        this.userTalentrank = userTalentrank;
        this.userRank = userRank;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userHiredate = userHiredate;
        this.userExperience = userExperience;
        this.userRemark = userRemark;
        this.user1 = user1;
        this.user2 = user2;
        this.user3 = user3;
        this.user4 = user4;
        this.userQschool = userQschool;
        this.userQmajor = userQmajor;
        this.userZschool = userZschool;
        this.userZmajor = userZmajor;
        this.userZeducation = userZeducation;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserQeducation() {
        return userQeducation;
    }

    public void setUserQeducation(String userQeducation) {
        this.userQeducation = userQeducation == null ? null : userQeducation.trim();
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany == null ? null : userCompany.trim();
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment == null ? null : userDepartment.trim();
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost == null ? null : userPost.trim();
    }

    public Integer getUserTalentrank() {
        return userTalentrank;
    }

    public void setUserTalentrank(Integer userTalentrank) {
        this.userTalentrank = userTalentrank;
    }

    public Integer getUserRank() {
        return userRank;
    }

    public void setUserRank(Integer userRank) {
        this.userRank = userRank;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUserHiredate() {
        return userHiredate;
    }

    public void setUserHiredate(Date userHiredate) {
        this.userHiredate = userHiredate;
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

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1 == null ? null : user1.trim();
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2 == null ? null : user2.trim();
    }

    public String getUser3() {
        return user3;
    }

    public void setUser3(String user3) {
        this.user3 = user3 == null ? null : user3.trim();
    }

    public String getUser4() {
        return user4;
    }

    public void setUser4(String user4) {
        this.user4 = user4 == null ? null : user4.trim();
    }

    public String getUserQschool() {
        return userQschool;
    }

    public void setUserQschool(String userQschool) {
        this.userQschool = userQschool == null ? null : userQschool.trim();
    }

    public String getUserQmajor() {
        return userQmajor;
    }

    public void setUserQmajor(String userQmajor) {
        this.userQmajor = userQmajor == null ? null : userQmajor.trim();
    }

    public String getUserZschool() {
        return userZschool;
    }

    public void setUserZschool(String userZschool) {
        this.userZschool = userZschool == null ? null : userZschool.trim();
    }

    public String getUserZmajor() {
        return userZmajor;
    }

    public void setUserZmajor(String userZmajor) {
        this.userZmajor = userZmajor == null ? null : userZmajor.trim();
    }

    public String getUserZeducation() {
        return userZeducation;
    }

    public void setUserZeducation(String userZeducation) {
        this.userZeducation = userZeducation == null ? null : userZeducation.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userBirthday=" + userBirthday +
                ", userAge=" + userAge +
                ", userQeducation='" + userQeducation + '\'' +
                ", userCompany='" + userCompany + '\'' +
                ", userDepartment='" + userDepartment + '\'' +
                ", userPost='" + userPost + '\'' +
                ", userTalentrank=" + userTalentrank +
                ", userRank=" + userRank +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userHiredate=" + userHiredate +
                ", userExperience='" + userExperience + '\'' +
                ", userRemark='" + userRemark + '\'' +
                ", user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                ", user3='" + user3 + '\'' +
                ", user4='" + user4 + '\'' +
                ", userQschool='" + userQschool + '\'' +
                ", userQmajor='" + userQmajor + '\'' +
                ", userZschool='" + userZschool + '\'' +
                ", userZmajor='" + userZmajor + '\'' +
                ", userZeducation='" + userZeducation + '\'' +
                '}';
    }
}