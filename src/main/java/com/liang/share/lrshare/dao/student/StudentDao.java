package com.liang.share.lrshare.dao.student;

import com.liang.share.lrshare.model.student.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao {
    /**
     *学生和教师注册
     */
    boolean addUser(Student student);
 /**
  * 根据条件查询学生或者教师的个人信息
  */
   List<Student> getAll(Student student);


}