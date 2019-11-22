package com.liang.share.lrshare.model;

/**
 * 公用的基础类
 */
public class Base {
    private int id;
    private String gmtCreate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", gmtCreate='" + gmtCreate + '\'' +
                '}';
    }
}
