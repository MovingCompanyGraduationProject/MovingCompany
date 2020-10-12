package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class AuthorityManager {
    private Integer authoritymanagerid;

    private Integer authoritytypeid;
    
    private String authoritytypename;

    private String authorityrule;

    private String authorityname;

    private String authoritymanagerstatus;

    private Integer creator;
    
    private String creatorname;

    private Date createtime;

    private Integer modifier;
    
    private String modifiername;

    private Date updatetime;

    public String getAuthoritytypename() {
		return authoritytypename;
	}

	public void setAuthoritytypename(String authoritytypename) {
		this.authoritytypename = authoritytypename;
	}

	public String getCreatorname() {
		return creatorname;
	}

	public void setCreatorname(String creatorname) {
		this.creatorname = creatorname;
	}

	public String getModifiername() {
		return modifiername;
	}

	public void setModifiername(String modifiername) {
		this.modifiername = modifiername;
	}

	public Integer getAuthoritymanagerid() {
        return authoritymanagerid;
    }

    public void setAuthoritymanagerid(Integer authoritymanagerid) {
        this.authoritymanagerid = authoritymanagerid;
    }

    public Integer getAuthoritytypeid() {
        return authoritytypeid;
    }

    public void setAuthoritytypeid(Integer authoritytypeid) {
        this.authoritytypeid = authoritytypeid;
    }

    public String getAuthorityrule() {
        return authorityrule;
    }

    public void setAuthorityrule(String authorityrule) {
        this.authorityrule = authorityrule == null ? null : authorityrule.trim();
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname == null ? null : authorityname.trim();
    }

    public String getAuthoritymanagerstatus() {
        return authoritymanagerstatus;
    }

    public void setAuthoritymanagerstatus(String authoritymanagerstatus) {
        this.authoritymanagerstatus = authoritymanagerstatus == null ? null : authoritymanagerstatus.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}