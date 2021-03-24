package com.pdh.dao;

import com.pdh.pojo.Competition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-08-13:38
 */
public interface CompetitionMapper {
    //增加一个竞赛
    int addCompetition(Competition competition);

    //结束一个比赛
    int deleteCompetition(@Param("competitionId") int competitionId);
    //修改一个比赛
    int updateCompetition(Competition competition);
    //查询比赛
    List<Competition> queryCompetitionLikeName(@Param("competitionName") String competitionName);
    //查看比赛
    Competition queryCompetitionById(@Param("competitionId") int competitionId);
    //发布比赛
    Competition queryCompetitionByName(@Param("competitionName") String competitionName);
    //查看全部竞赛
    List<Competition> queryAllCompetition();

}
