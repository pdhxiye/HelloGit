package com.pdh.service;

import com.pdh.dao.CompetitionMapper;
import com.pdh.pojo.Competition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pdh
 * @create 2021-02-08-14:02
 */
public class CompetitionServiceImpl implements CompetitionService {
    private CompetitionMapper competitionMapper;

    public void setCompetitionMapper(CompetitionMapper competitionMapper) {
        this.competitionMapper = competitionMapper;
    }

    @Override
    public int addCompetition(Competition competition) {
        return competitionMapper.addCompetition(competition);
    }

    @Override
    public int deleteCompetition(int competitionId) {
        return competitionMapper.deleteCompetition(competitionId);
    }

    @Override
    public int updateCompetition(Competition competition) {
        return competitionMapper.updateCompetition(competition);
    }

    @Override
    public List<Competition> queryCompetitionLikeName(String competitionName) {
        return competitionMapper.queryCompetitionLikeName(competitionName);
    }

    @Override
    public Competition queryCompetitionById(int competitionId) {
        return competitionMapper.queryCompetitionById(competitionId);
    }

    @Override
    public boolean queryCompetitionByName(String competitionName) {
        if (competitionMapper.queryCompetitionByName(competitionName)==null){
            return false;
        }
        return true;
    }

    @Override
    public List<Competition> queryAllCompetition() {
        return competitionMapper.queryAllCompetition();
    }

}
