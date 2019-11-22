package com.liang.share.lrshare.model.student;

import com.liang.share.lrshare.model.Base;

/**
 * 学生与老师的实体类
 */
public class Student extends Base {
    private String userName;
    private String password;
    private String major;
    private int typeNumber;
    private int studentNumber;
    private int type;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", major='" + major + '\'' +
                ", typeNumber=" + typeNumber +
                ", studentNumber=" + studentNumber +
                ", type=" + type +
                '}';
    }
}
