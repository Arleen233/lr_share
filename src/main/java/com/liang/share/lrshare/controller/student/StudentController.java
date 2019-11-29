package com.liang.share.lrshare.controller.student;

import com.liang.share.lrshare.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    /**
     * 学生与教师的注册
     */
    @ResponseBody
    @PostMapping("/add")
    public boolean addUser(@RequestParam("username")String userName,@RequestParam("pass")String password
                    ,@RequestParam("major")String major,@RequestParam("school")int typeNumber,
                           @RequestParam("number")int studentNumber,@RequestParam("type")int type){
        return studentService.addUser(userName,password,major,typeNumber,studentNumber,type);
    }
    /**
     * 跳转到注册页面
     */
    @RequestMapping("register")
    public String register(){return "register";}

}
