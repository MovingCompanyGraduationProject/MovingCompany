package com.hlbrc.movingcompany.entity;

import java.util.Date;
import java.util.List;

public class CompanyMessage {
    private Integer companymessageid;

    private Integer disId;

    private String name;

    private Double money;

    private String servicecontext;

    private String feature;

    private String region;

    private String promise;

    private String linkman;

    private String tel;

    private String address;

    private String approvestate;

    private String businesslicense;

    private Integer userid;

    private Date createtime;

    private Date updatetime;
    
    private ServiceDescribe serviceDescribe;
    
    private List<Companyphoto> companyphoto;

    public ServiceDescribe getServiceDescribe() {
		return serviceDescribe;
	}

	public void setServiceDescribe(ServiceDescribe serviceDescribe) {
		this.serviceDescribe = serviceDescribe;
	}

	public List<Companyphoto> getCompanyphoto() {
		return companyphoto;
	}

	public void setCompanyphoto(List<Companyphoto> companyphoto) {
		this.companyphoto = companyphoto;
	}

	public Integer getCompanymessageid() {
        return companymessageid;
    }

    public void setCompanymessageid(Integer companymessageid) {
        this.companymessageid = companymessageid;
    }

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getServicecontext() {
        return servicecontext;
    }

    public void setServicecontext(String servicecontext) {
        this.servicecontext = servicecontext == null ? null : servicecontext.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise == null ? null : promise.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getApprovestate() {
        return approvestate;
    }

    public void setApprovestate(String approvestate) {
        this.approvestate = approvestate == null ? null : approvestate.trim();
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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