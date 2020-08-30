package com.hlbrc.movingcompany.entity;

public class District {
    private Integer disid;

    private String disname;

    private String citid;

    public Integer getDisid() {
        return disid;
    }

    public void setDisid(Integer disid) {
        this.disid = disid;
    }

    public String getDisname() {
        return disname;
    }

    public void setDisname(String disname) {
        this.disname = disname == null ? null : disname.trim();
    }

    public String getCitid() {
        return citid;
    }

    public void setCitid(String citid) {
        this.citid = citid == null ? null : citid.trim();
    }
}