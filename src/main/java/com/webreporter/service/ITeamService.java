
package com.webreporter.service;

import com.webreporter.form.TeamForm;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public interface ITeamService {
    
    void createTeamForm(TeamForm teamForm);

    void updateTeamForm(TeamForm teamForm);

    List<TeamForm> listAllTeamForm();

    void deleteTeamForm(TeamForm teamForm);

    TeamForm findTeamFormById(long teamFormId);
}
