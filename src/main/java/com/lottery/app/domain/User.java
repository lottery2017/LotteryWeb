package com.lottery.app.domain;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String phoneNum;

    private Integer usertype;

    private Date registDate;

    private Integer recommender;

    private String headimageUrl;

    private Date modifyDate;

    private String organizeId;

    private String validTag;

    private byte[] nickname;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Integer getRecommender() {
        return recommender;
    }

    public void setRecommender(Integer recommender) {
        this.recommender = recommender;
    }

    public String getHeadimageUrl() {
        return headimageUrl;
    }

    public void setHeadimageUrl(String headimageUrl) {
        this.headimageUrl = headimageUrl == null ? null : headimageUrl.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(String organizeId) {
        this.organizeId = organizeId == null ? null : organizeId.trim();
    }

    public String getValidTag() {
        return validTag;
    }

    public void setValidTag(String validTag) {
        this.validTag = validTag == null ? null : validTag.trim();
    }

    public byte[] getNickname() {
        return nickname;
    }

    public void setNickname(byte[] nickname) {
        this.nickname = nickname;
    }
}