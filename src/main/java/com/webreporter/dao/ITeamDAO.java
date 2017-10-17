package com.webreporter.dao;

import com.webreporter.entity.Team;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public interface ITeamDAO {
    
    void createTeam(Team team);

    void updateTeam(Team team);

    List<Team> listAllTeam();

    void deleteTeam(Team team);

    Team findTeamById(long teamId);
}
