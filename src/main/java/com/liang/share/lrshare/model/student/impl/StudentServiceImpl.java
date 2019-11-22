package com.liang.share.lrshare.model.student.impl;

import com.github.pagehelper.util.StringUtil;
import com.liang.share.lrshare.dao.student.StudentDao;
import com.liang.share.lrshare.model.student.Student;
import com.liang.share.lrshare.service.student.StudentService;
import com.liang.share.lrshare.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean addUser(String userName, String password, String major,
                           int typeNumber, int studentNumber, int type) {
        if (StringUtil.isEmpty(userName)||StringUtil.isEmpty(password)||StringUtil.isEmpty(major)){
            throw new RuntimeException("输入的数据有误");
        }else {
            try {
                Student student= new Student();
                student.setStudentNumber(studentNumber);
                if (studentDao.getAll(student).size()!=0){
                    throw new RuntimeException("该号码已经注册");
                }else{
                    student.setUserName(userName);
                    student.setMajor(major);
                    student.setPassword(password);
                    student.setType(type);
                    student.setTypeNumber(typeNumber);
                    student.setGmtCreate(DateUtils.getCurrentTime());
                    return studentDao.addUser(student);
                }
            }catch (Exception e){
                throw new RuntimeException("注册失败"+e.getMessage());
            }
        }
    }
}
