package com.pdh.pojo;

/**
 * @author pdh
 * @create 2021-02-16-10:40
 */
//报名表
public class ContestantUser {
    private String contestantName;
    private String contestantGrade;
    private int competitionId;
    private int studentId;
    private Integer userId;



    public ContestantUser() {
    }

    public ContestantUser(String contestantName, String contestantGrade, int competitionId, int studentId, Integer userId) {
        this.contestantName = contestantName;
        this.contestantGrade = contestantGrade;
        this.competitionId = competitionId;
        this.studentId = studentId;
        this.userId = userId;
    }

    public String getContestantName() {
        return contestantName;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName;
    }

    public String getContestantGrade() {
        return contestantGrade;
    }

    public void setContestantGrade(String contestantGrade) {
        this.contestantGrade = contestantGrade;
    }

    public int getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(int cId) {
        this.competitionId = competitionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "ContestantUser{" +
                "contestantName='" + contestantName + '\'' +
                ", contestantGrade='" + contestantGrade + '\'' +
                ", competitionId=" + competitionId +
                ", studentId=" + studentId +
                ", userId=" + userId +

                '}';
    }


}
