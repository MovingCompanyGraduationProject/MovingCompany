package com.hlbrc.movingcompany.entity;

public class ServiceDescribe {
    private Integer servicedescribeid;

    private Integer companymessageid;

    private String subtitle;

    private String contextnum;

    private String specialann;

    public Integer getServicedescribeid() {
        return servicedescribeid;
    }

    public void setServicedescribeid(Integer servicedescribeid) {
        this.servicedescribeid = servicedescribeid;
    }

    public Integer getCompanymessageid() {
        return companymessageid;
    }

    public void setCompanymessageid(Integer companymessageid) {
        this.companymessageid = companymessageid;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getContextnum() {
        return contextnum;
    }

    public void setContextnum(String contextnum) {
        this.contextnum = contextnum == null ? null : contextnum.trim();
    }

    public String getSpecialann() {
        return specialann;
    }

    public void setSpecialann(String specialann) {
        this.specialann = specialann == null ? null : specialann.trim();
    }
}