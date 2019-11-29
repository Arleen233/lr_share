package com.liang.share.lrshare.service.student;



public interface StudentService {
    /**
     * 学生与教师的注册
     */
    boolean addUser(String userName,String password,String major,
                    int typeNumber,int studentNumber,int type );
}
