package com.pdh.service;

import com.pdh.pojo.Competition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-08-14:02
 */
public interface CompetitionService {
    //增加一个竞赛
    int addCompetition(Competition competition);

    //结束一个比赛
    int deleteCompetition(int competitionId);
    //修改一个比赛
    int updateCompetition(Competition competition);
    //查询比赛
    List<Competition> queryCompetitionLikeName(String competitionName);
    //查看比赛
    Competition queryCompetitionById(@Param("competitionId") int competitionId);
    //发布比赛
    boolean queryCompetitionByName(@Param("competitionName") String competitionName);
    //查看全部竞赛
    List<Competition> queryAllCompetition();

}
