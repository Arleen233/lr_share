package com.liang.share.lrshare.service.impl;

import com.github.pagehelper.util.StringUtil;
import com.liang.share.lrshare.dao.SchoolDao;
import com.liang.share.lrshare.model.school.School;
import com.liang.share.lrshare.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolDao schoolDao;

    @Override
    public List<School> getAll() {
        School school = new School();
        return schoolDao.getAll(school);
    }

    @Override
    public boolean addPassword(int typeNumber,String password) {
        if (StringUtil.isEmpty(String.valueOf(typeNumber))||StringUtil.isEmpty(password)){
            throw new RuntimeException("数据为空");
        }else {
            try {
                School school = new School();
                school.setTypeNumber(typeNumber);
                List<School> schools = schoolDao.getAll(school);
                if (schools.size()!=0){
                    return schoolDao.addPassword(typeNumber,password);
                }else {
                    throw new RuntimeException("该学校不存在");
                }
            }catch (Exception e){
                throw new RuntimeException("数据错误" +e.getMessage());
            }
        }
    }
}
