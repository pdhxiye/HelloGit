package com.pdh.controller;

import com.pdh.pojo.Student;
import com.pdh.pojo.Teacher;
import com.pdh.service.StudentService;
import com.pdh.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pdh
 * @create 2021-02-07-11:15
 */
@Controller
@RequestMapping("/register")
public class LoginController {

    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    @Autowired
    @Qualifier("TeacherServiceImpl")
    private TeacherService teacherService;



    @RequestMapping("/login")
    public String login(int userId, String password, String boy, Model model) {
        System.out.println(boy);
        if ("student".equals(boy)) {
            Student student = studentService.registerStudent(new Student(userId, null, password, null));
            if (student!=null){
                model.addAttribute("student",student);
                return "login-student";
            }
        }else if("teacher".equals(boy)){
            Teacher teacher = teacherService.queryTeacherBYIP(new Teacher(userId, null, password));

            if (teacher!=null){
                return "login-teacher";
            }
        }
            return "index";

    }
}
