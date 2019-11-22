package com.liang.share.lrshare.service.school;

import com.liang.share.lrshare.model.school.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {
    /**
     * 得到所有的学校显示在页面
     */
    List<School> getAll();
    /**
     *注册时设置密码
     */
    boolean addPassword(int typeNumber,String password);

}
