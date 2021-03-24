package com.pdh.dao;

import com.pdh.pojo.ContestantUser;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-16-10:44
 */
public interface ContestantMapper {
    //报名
    int addContestant(ContestantUser contestantUser);

    //取消报名
    int deleteContestant(String competitionName);

    //查询个人报名情况
    ContestantUser queryContestantUser(int competitionId);
    //查看报名情况
    List<ContestantUser> queryContestant(int competitionId);

}
