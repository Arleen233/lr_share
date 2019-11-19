package com.liang.share.lrshare.model.school;

import com.liang.share.lrshare.model.Base;

/**
 * 学校的实体类
 */
public class School extends Base {
    private int typeNumber;
    private String typeName;


    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


    @Override
    public String toString() {
        return "School{" +
                "typeNumber=" + typeNumber +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
