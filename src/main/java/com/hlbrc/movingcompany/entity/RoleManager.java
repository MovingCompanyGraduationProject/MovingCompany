package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class RoleManager {
    private Integer rolemanagerid;

    private String rolename;

    private String roledescribe;

    private String rolestatus;

    private Integer creator;
    
    private String creatorname;

    private Date createtime;

    private Integer modifier;
    
    private String modifiername;
    
    private String authoritynames;

    private Date updatetime;

    public String getAuthoritynames() {
		return authoritynames;
	}

	public void setAuthoritynames(String authoritynames) {
		this.authoritynames = authoritynames;
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


	public Integer getRolemanagerid() {
        return rolemanagerid;
    }

    public void setRolemanagerid(Integer rolemanagerid) {
        this.rolemanagerid = rolemanagerid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledescribe() {
        return roledescribe;
    }

    public void setRoledescribe(String roledescribe) {
        this.roledescribe = roledescribe == null ? null : roledescribe.trim();
    }

    public String getRolestatus() {
        return rolestatus;
    }

    public void setRolestatus(String rolestatus) {
        this.rolestatus = rolestatus == null ? null : rolestatus.trim();
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