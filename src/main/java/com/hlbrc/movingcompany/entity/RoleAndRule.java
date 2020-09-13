package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class RoleAndRule {
    private Integer roleandruleid;

    private Integer authoritymanagerid;

    private Integer rolemanagerid;

    private Integer managerid;

    private String roleandrulestatus;

    private Integer creator;

    private Date createtime;

    private Integer modifier;

    private Date updatetime;

    public Integer getRoleandruleid() {
        return roleandruleid;
    }

    public void setRoleandruleid(Integer roleandruleid) {
        this.roleandruleid = roleandruleid;
    }

    public Integer getAuthoritymanagerid() {
        return authoritymanagerid;
    }

    public void setAuthoritymanagerid(Integer authoritymanagerid) {
        this.authoritymanagerid = authoritymanagerid;
    }

    public Integer getRolemanagerid() {
        return rolemanagerid;
    }

    public void setRolemanagerid(Integer rolemanagerid) {
        this.rolemanagerid = rolemanagerid;
    }

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getRoleandrulestatus() {
        return roleandrulestatus;
    }

    public void setRoleandrulestatus(String roleandrulestatus) {
        this.roleandrulestatus = roleandrulestatus == null ? null : roleandrulestatus.trim();
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