package com.pdh.service;

import com.pdh.dao.ContestantMapper;
import com.pdh.pojo.ContestantUser;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-16-11:24
 */
public class ContestantServiceImpl implements ContestantService{
    private ContestantMapper contestantMapper;

    public void setContestantMapper(ContestantMapper contestantMapper) {
        this.contestantMapper = contestantMapper;
    }

    @Override
    public int addContestant(ContestantUser contestantUser) {
        return contestantMapper.addContestant(contestantUser);
    }

    @Override
    public int deleteContestant(String competitionName) {
        return contestantMapper.deleteContestant(competitionName);
    }

    @Override
    public boolean queryContestantUser(int competitionId) {
        if (contestantMapper.queryContestantUser(competitionId)==null){
            //等于null说明没查到，没查到表示没报名
            return false;
        }
        return true;
    }

    @Override
    public List<ContestantUser> queryContestant(int competitionId) {
        return contestantMapper.queryContestant(competitionId);
    }
}
