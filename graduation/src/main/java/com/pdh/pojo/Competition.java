package com.pdh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @author pdh
 * @create 2021-02-08-11:49
 */
public class Competition {
    private Integer competitionId;
    private String competitionText;
    private String competitionPlace;
    private String competitionName;

    public Competition() {
    }

    public Competition(Integer competitionId, String competitionName,String competitionText, String competitionPlace) {
        this.competitionId = competitionId;

        this.competitionText = competitionText;
        this.competitionPlace = competitionPlace;
        this.competitionName = competitionName;
    }


    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }



    public String getCompetitionText() {
        return competitionText;
    }

    public void setCompetitionText(String competitionText) {
        this.competitionText = competitionText;
    }

    public String getCompetitionPlace() {
        return competitionPlace;
    }

    public void setCompetitionPlace(String competitionPlace) {
        this.competitionPlace = competitionPlace;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }


    @Override
    public String toString() {
        return "Competition{" +
                "competitionId=" + competitionId +
                ", competitionText='" + competitionText + '\'' +
                ", competitionPlace='" + competitionPlace + '\'' +
                ", competitionName='" + competitionName + '\'' +
                '}';
    }
}