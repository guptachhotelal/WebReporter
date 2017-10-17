package com.webreporter.dao.impl;

import com.webreporter.dao.ITeamDAO;
import com.webreporter.entity.Team;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chhotelal
 */
@Repository
public class TeamDAO<T> extends BaseDAO<Team> implements ITeamDAO {

    @Override
    public void createTeam(Team team) {
        super.create(team);
    }

    @Override
    public void updateTeam(Team team) {
        super.update(team);
    }

    @Override
    public List<Team> listAllTeam() {
        return super.listAll(Team.class);
    }

    @Override
    public void deleteTeam(Team team) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Team findTeamById(long teamId) {
        return super.findById(Team.class, teamId);
    }

}
