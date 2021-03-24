package com.pdh.service;

import com.pdh.pojo.ContestantUser;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-16-11:23
 */
public interface ContestantService {
    //报名
    int addContestant(ContestantUser contestantUser);

    //取消报名
    int deleteContestant(String competitionName);

    //查询个人报名
    public boolean queryContestantUser(int competitionId);

    //查看报名情况
    List<ContestantUser> queryContestant(int competitionId);

}
