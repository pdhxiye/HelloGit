package com.pdh.controller;

import com.pdh.pojo.Competition;
import com.pdh.pojo.ContestantUser;
import com.pdh.pojo.Student;
import com.pdh.service.CompetitionService;
import com.pdh.service.ContestantService;
import com.pdh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-16-11:26
 */
@Controller
@RequestMapping("/contestant")
public class ContestantController {
   @Autowired
   @Qualifier("ContestantServiceImpl")
   private ContestantService contestantService;

    @Autowired
    @Qualifier("CompetitionServiceImpl")
    private CompetitionService competitionService;

    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

   /*
    *
    * 报名
    * @author pdh
    * @date
    * @param
    * @return
    */
    @RequestMapping("/apply")
    public String toAdd(int id,Model model,int UserId){
        Competition competition = competitionService.queryCompetitionById(id);
        Student student = studentService.queryStudentById1(UserId);
        if (contestantService.queryContestantUser(id)){
            model.addAttribute("error","已报名");
            return "true";
        }
        model.addAttribute("QStudent",student);
        model.addAttribute("PCompetition",competition);
        return "apply";
    }
    @RequestMapping("/addApply")
    public String add(int studentId,String studentName,String studentGrade,int competitionId,Model model){
        System.out.println(competitionId);
        System.out.println(studentName);
        //false 没查到  true 查到
        if (studentService.queryStudentByIN(studentId,studentName)&&!contestantService.queryContestantUser(competitionId)){
            contestantService.addContestant(new ContestantUser(studentName,studentGrade,competitionId,studentId,null));
            model.addAttribute("error","报名成功");
           // model.addAttribute("error","学生信息不正确");
            return "false";
            //false  没报名 true 报名了
        }else {
             model.addAttribute("error","学生信息不正确");
            return "true";
        }

    }
    @RequestMapping("/query")
    public String query(int id,Model model){
        List<ContestantUser> contestantUsers = contestantService.queryContestant(id);
        model.addAttribute("contestantUsers",contestantUsers);
        return "contestantUser";
    }
}
