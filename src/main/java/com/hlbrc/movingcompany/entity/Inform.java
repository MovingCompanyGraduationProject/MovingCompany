package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class Inform {
    private Integer informid;

    private Integer companymessageid;

    private String name;

    private String contextnum;

    private Date createtime;

    public Integer getInformid() {
        return informid;
    }

    public void setInformid(Integer informid) {
        this.informid = informid;
    }

    public Integer getCompanymessageid() {
        return companymessageid;
    }

    public void setCompanymessageid(Integer companymessageid) {
        this.companymessageid = companymessageid;
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