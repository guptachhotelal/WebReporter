package com.webreporter.service.impl;

import com.webreporter.dao.ITeamDAO;
import com.webreporter.entity.Team;
import com.webreporter.form.TeamForm;
import com.webreporter.service.ITeamService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chhotelal
 */
@Service
@Transactional
public class TeamService implements ITeamService {

    @Resource
    private ITeamDAO teamDAO;

    @Override
    public void createTeamForm(TeamForm teamForm) {
        Team team = new Team();
        team.setTeamName(teamForm.getTeamName());
        team.setRemark(teamForm.getRemark());
        teamDAO.createTeam(team);
    }

    @Override
    public void updateTeamForm(TeamForm teamForm) {
        Team team = teamDAO.findTeamById(teamForm.getId());
        team.setId(teamForm.getId());
        team.setTeamName(teamForm.getTeamName());
        team.setRemark(teamForm.getRemark());
        teamDAO.updateTeam(team);
    }

    @Override
    public List<TeamForm> listAllTeamForm() {
        List<Team> teams = teamDAO.listAllTeam();
        List<TeamForm> listTeam = new ArrayList<>();
        for (Team team : teams) {
            TeamForm tf = new TeamForm();
            tf.setId(team.getId());
            tf.setTeamName(team.getTeamName());
            tf.setRemark(team.getRemark());
            listTeam.add(tf);
        }
        return listTeam;
    }

    @Override
    public void deleteTeamForm(TeamForm teamForm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeamForm findTeamFormById(long teamFormId) {
        Team team = teamDAO.findTeamById(teamFormId);
        TeamForm tf = new TeamForm();
        tf.setId(team.getId());
        tf.setTeamName(team.getTeamName());
        tf.setRemark(team.getRemark());
        return tf;
    }

}
