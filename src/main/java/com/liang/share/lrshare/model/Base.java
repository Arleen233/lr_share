package com.liang.share.lrshare.model;

/**
 * 公用的基础类
 */
public class Base {
    private int id;
    private String gmtTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGmtTime() {
        return gmtTime;
    }

    public void setGmtTime(String gmtTime) {
        this.gmtTime = gmtTime;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", gmtTime='" + gmtTime + '\'' +
                '}';
    }
}
