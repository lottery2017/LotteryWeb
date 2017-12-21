package com.caipiao.app.dao;

import java.util.Date;

public class TabUserBasicInfomation {
    private Integer userid;

    private String username;

    private String yhdh;

    private Integer yhlx;

    private Date lrrq;

    private Integer lrry;

    private String txurl;

    private Date xgrq;

    private String zzid;

    private String yxbz;

    private byte[] yhnc;

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

    public String getYhdh() {
        return yhdh;
    }

    public void setYhdh(String yhdh) {
        this.yhdh = yhdh == null ? null : yhdh.trim();
    }

    public Integer getYhlx() {
        return yhlx;
    }

    public void setYhlx(Integer yhlx) {
        this.yhlx = yhlx;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public Integer getLrry() {
        return lrry;
    }

    public void setLrry(Integer lrry) {
        this.lrry = lrry;
    }

    public String getTxurl() {
        return txurl;
    }

    public void setTxurl(String txurl) {
        this.txurl = txurl == null ? null : txurl.trim();
    }

    public Date getXgrq() {
        return xgrq;
    }

    public void setXgrq(Date xgrq) {
        this.xgrq = xgrq;
    }

    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid == null ? null : zzid.trim();
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }

    public byte[] getYhnc() {
        return yhnc;
    }

    public void setYhnc(byte[] yhnc) {
        this.yhnc = yhnc;
    }
}