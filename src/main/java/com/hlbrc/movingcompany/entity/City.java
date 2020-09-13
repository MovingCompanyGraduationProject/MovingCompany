package com.hlbrc.movingcompany.entity;

public class City {
    private Integer citid;

    private String citname;

    private String proid;

    public Integer getCitid() {
        return citid;
    }

    public void setCitid(Integer citid) {
        this.citid = citid;
    }

    public String getCitname() {
        return citname;
    }

    public void setCitname(String citname) {
        this.citname = citname == null ? null : citname.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }
}