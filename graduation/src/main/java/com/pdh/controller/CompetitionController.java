package com.pdh.controller;

import com.pdh.pojo.Competition;
import com.pdh.pojo.ContestantUser;
import com.pdh.pojo.Student;
import com.pdh.service.CompetitionService;
import com.pdh.service.ContestantService;
import com.pdh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author pdh
 * @create 2021-02-08-14:06
 */
@Controller
@RequestMapping("/competition")
public class CompetitionController {
    @Autowired
    @Qualifier("CompetitionServiceImpl")
    private CompetitionService competitionService;
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    /*
     *  查询比赛方法
     *
     * @author pdh
     * @date
     * @param
     * @return java.lang.String
     */
    @RequestMapping("/query")
    public String query(String queryCompetitionName, Model model,int studentId){
        System.out.println(queryCompetitionName);
        List<Competition> competitions = competitionService.queryCompetitionLikeName(queryCompetitionName);
        System.out.println("=====");
        System.out.println(competitions);
        Student student = studentService.queryStudentById1(studentId);
        model.addAttribute("competitions",competitions);
            model.addAttribute("PStudent",student);
            return "search";
    }
    /*
     *
     * 查看比赛详情
     * @author pdh
     * @date
     * @param
     * @return
     */
    @RequestMapping("/toSee")
    public String toSee(int id,Model model){
        Competition competition = competitionService.queryCompetitionById(id);
        model.addAttribute("QCompetition",competition);
        return "see";
    }
    @RequestMapping("/toAdd")
    public String toAddCompetition(){

        return "add";
    }


    @RequestMapping("/addCompetition")
    public String addCompetition(String competitionName, String competitionPlace, String competitionText,Model model){
        if (competitionService.queryCompetitionByName(competitionName)){
            model.addAttribute("error","该比赛已发布");
            return "false";
        }else {
            competitionService.addCompetition(new Competition(null,competitionName,competitionPlace,competitionText));
            model.addAttribute("error","发布成功");
            return "true";
        }

    }

    //查看全部竞赛
    @RequestMapping("/allCompetition")
    public String queryAllCompetition(Model model){
        List<Competition> competitions = competitionService.queryAllCompetition();
        model.addAttribute("QCompetition",competitions);
        return "allCompetition";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Competition competition = competitionService.queryCompetitionById(id);
        model.addAttribute("competitions",competition);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Competition competition){
        competitionService.updateCompetition(competition);
        return "redirect:/competition/allCompetition";
    }
    @RequestMapping("/delete/{competitionId}")
    public String deleteCompetition(@PathVariable("competitionId") int id){
        competitionService.deleteCompetition(id);
        return "redirect:/competition/allCompetition";
    }
//    @InitBinder
//    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd hh:mm:ss");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }
}
