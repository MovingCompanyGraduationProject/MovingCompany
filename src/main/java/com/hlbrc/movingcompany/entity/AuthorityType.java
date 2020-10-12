package com.hlbrc.movingcompany.entity;

import java.util.Date;
import java.util.List;

public class AuthorityType {
    private Integer authoritytypeid;

    private String authorityname;

    private String authoritytypestatus;

    private Integer creator;
    
    private String creatorname;

    private Date createtime;

    private Integer modifier;
    
    private String modifiername;

    private Date updatetime;
    
    private List<AuthorityManager> authorityManager;

    public List<AuthorityManager> getAuthorityManager() {
		return authorityManager;
	}

	public void setAuthorityManager(List<AuthorityManager> authorityManager) {
		this.authorityManager = authorityManager;
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

	public Integer getAuthoritytypeid() {
        return authoritytypeid;
    }

    public void setAuthoritytypeid(Integer authoritytypeid) {
        this.authoritytypeid = authoritytypeid;
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname == null ? null : authorityname.trim();
    }

    public String getAuthoritytypestatus() {
        return authoritytypestatus;
    }

    public void setAuthoritytypestatus(String authoritytypestatus) {
        this.authoritytypestatus = authoritytypestatus == null ? null : authoritytypestatus.trim();
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