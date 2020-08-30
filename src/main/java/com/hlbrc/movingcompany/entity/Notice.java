package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class Notice {
    private Integer noticeid;

    private Integer managerid;

    private String name;

    private String contextnum;

    private Date createtime;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContextnum() {
        return contextnum;
    }

    public void setContextnum(String contextnum) {
        this.contextnum = contextnum == null ? null : contextnum.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}