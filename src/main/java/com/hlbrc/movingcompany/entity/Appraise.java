package com.hlbrc.movingcompany.entity;

public class Appraise {
    private Integer appraiseid;

    private Integer userid;

    private Integer companymessageid;

    private String overallmerit;

    private String manner;

    private String fiducialpoint;

    private String vehiclecondition;

    private String contextcode;

    private String appraisetype;

    private Integer likenum;
    
    private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getAppraiseid() {
        return appraiseid;
    }

    public void setAppraiseid(Integer appraiseid) {
        this.appraiseid = appraiseid;
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

    public String getOverallmerit() {
        return overallmerit;
    }

    public void setOverallmerit(String overallmerit) {
        this.overallmerit = overallmerit == null ? null : overallmerit.trim();
    }

    public String getManner() {
        return manner;
    }

    public void setManner(String manner) {
        this.manner = manner == null ? null : manner.trim();
    }

    public String getFiducialpoint() {
        return fiducialpoint;
    }

    public void setFiducialpoint(String fiducialpoint) {
        this.fiducialpoint = fiducialpoint == null ? null : fiducialpoint.trim();
    }

    public String getVehiclecondition() {
        return vehiclecondition;
    }

    public void setVehiclecondition(String vehiclecondition) {
        this.vehiclecondition = vehiclecondition == null ? null : vehiclecondition.trim();
    }

    public String getContextcode() {
        return contextcode;
    }

    public void setContextcode(String contextcode) {
        this.contextcode = contextcode == null ? null : contextcode.trim();
    }

    public String getAppraisetype() {
        return appraisetype;
    }

    public void setAppraisetype(String appraisetype) {
        this.appraisetype = appraisetype == null ? null : appraisetype.trim();
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }
}