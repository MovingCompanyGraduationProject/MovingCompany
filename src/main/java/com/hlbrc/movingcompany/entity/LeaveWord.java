package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class LeaveWord {
    private Integer leavewordid;
    /**企业名称*/
    private String corporationname;
    /**入驻城市*/
    private String town;
    /**联系人*/
    private String linkman;
    /**联系电话*/
    private String tel;
    /**微信号*/
    private String wechatid;
    /**留言类别*/
    private String leavemessage;
    /**创建时间*/
    private Date createtime;

    public Integer getLeavewordid() {
        return leavewordid;
    }

    public void setLeavewordid(Integer leavewordid) {
        this.leavewordid = leavewordid;
    }

    public String getCorporationname() {
        return corporationname;
    }

    public void setCorporationname(String corporationname) {
        this.corporationname = corporationname == null ? null : corporationname.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid == null ? null : wechatid.trim();
    }

    public String getLeavemessage() {
        return leavemessage;
    }

    public void setLeavemessage(String leavemessage) {
        this.leavemessage = leavemessage == null ? null : leavemessage.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}