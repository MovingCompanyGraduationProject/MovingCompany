package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class Orderform {
    private Integer orderformid;

    private Integer userid;

    private Integer companymessageid;

    private String startsite;

    private String endsite;

    private String name;

    private String tel;

    private String remark;

    private Date movingtime;

    private Date createtime;
    
    private CompanyMessage companyMessage;
    
    private User user;

    public CompanyMessage getCompanyMessage() {
		return companyMessage;
	}

	public void setCompanyMessage(CompanyMessage companyMessage) {
		this.companyMessage = companyMessage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getOrderformid() {
        return orderformid;
    }

    public void setOrderformid(Integer orderformid) {
        this.orderformid = orderformid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCompanymessageid() {
        return companymessageid;
    }

    public void setCompanymessageid(Integer companymessageid) {
        this.companymessageid = companymessageid;
    }

    public String getStartsite() {
        return startsite;
    }

    public void setStartsite(String startsite) {
        this.startsite = startsite == null ? null : startsite.trim();
    }

    public String getEndsite() {
        return endsite;
    }

    public void setEndsite(String endsite) {
        this.endsite = endsite == null ? null : endsite.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getMovingtime() {
        return movingtime;
    }

    public void setMovingtime(Date movingtime) {
        this.movingtime = movingtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}