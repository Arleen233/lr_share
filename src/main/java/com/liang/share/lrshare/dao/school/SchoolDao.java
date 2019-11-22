package com.liang.share.lrshare.dao.school;

import com.liang.share.lrshare.model.school.School;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SchoolDao {
    /**
     * 得到所有的学校名称显示
     */
    List<School> getAll(School school);
    /**
     * 学校初次登陆时设置密码
     */
    boolean addPassword(int typeNumber,String password);
}
