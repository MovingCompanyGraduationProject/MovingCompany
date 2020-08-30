package com.hlbrc.movingcompany.entity;

import java.util.Date;

public class Companyphoto {
    private Integer companyphoto;

    private Integer companymessageid;

    private String path;

    private Date uploadtime;

    public Integer getCompanyphoto() {
        return companyphoto;
    }

    public void setCompanyphoto(Integer companyphoto) {
        this.companyphoto = companyphoto;
    }

    public Integer getCompanymessageid() {
        return companymessageid;
    }

    public void setCompanymessageid(Integer companymessageid) {
        this.companymessageid = companymessageid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}