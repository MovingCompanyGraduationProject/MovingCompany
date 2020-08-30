package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class Carmessage {
    private Integer carmessageid;

    private Integer companymessageid;

    private Integer cartypeid;

    private String customnum;

    private String licensenum;

    private String brand;

    private String gpsnum;

    private Double tonnage;

    private String carstate;

    private String remark;

    private Double money;

    private Date createtime;

    private Date updatetime;

    public Integer getCarmessageid() {
        return carmessageid;
    }

    public void setCarmessageid(Integer carmessageid) {
        this.carmessageid = carmessageid;
    }

    public Integer getCompanymessageid() {
        return companymessageid;
    }

    public void setCompanymessageid(Integer companymessageid) {
        this.companymessageid = companymessageid;
    }

    public Integer getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(Integer cartypeid) {
        this.cartypeid = cartypeid;
    }

    public String getCustomnum() {
        return customnum;
    }

    public void setCustomnum(String customnum) {
        this.customnum = customnum == null ? null : customnum.trim();
    }

    public String getLicensenum() {
        return licensenum;
    }

    public void setLicensenum(String licensenum) {
        this.licensenum = licensenum == null ? null : licensenum.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getGpsnum() {
        return gpsnum;
    }

    public void setGpsnum(String gpsnum) {
        this.gpsnum = gpsnum == null ? null : gpsnum.trim();
    }

    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    public String getCarstate() {
        return carstate;
    }

    public void setCarstate(String carstate) {
        this.carstate = carstate == null ? null : carstate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}