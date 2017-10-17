package com.webreporter.controller;

import com.webreporter.form.DoctorForm;
import com.webreporter.form.TeamForm;
import com.webreporter.service.IDoctorService;
import com.webreporter.service.ITeamService;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Chhotelal
 */
@Controller
public class TeamController {

    @Resource
    private IDoctorService doctorService;

    @Resource
    private ITeamService teamService;

    @RequestMapping(value = "/teamForm")
    public String showActivityForm(@ModelAttribute("teamForm") TeamForm teamForm, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        if (teamForm.getId() > 0) {
            TeamForm tf = teamService.findTeamFormById(teamForm.getId());
            map.addAttribute("teamForm", tf);
        }
        List<DoctorForm> doctorForms = doctorService.listAllDoctorForm();
        map.addAttribute("doctorsList", doctorForms);
        return "teamForm";
    }

    @RequestMapping(value = "/teamForm", method = RequestMethod.POST)
    public String addUpdateActivityForm(@ModelAttribute("teamForm") TeamForm teamForm, HttpServletRequest request, HttpServletResponse response) {
        if (teamForm.getId() > 0) {
            teamService.updateTeamForm(teamForm);
        } else {
            teamService.createTeamForm(teamForm);
        }
        return "redirect:teamList.htm";
    }

    @RequestMapping(value = "/teamList")
    public String listDoctors(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        List<TeamForm> teamList = teamService.listAllTeamForm();
        map.addAttribute("teamList", teamList);
        return "teamList";
    }
    //
    //    @ModelAttribute("doctorsList")
    //    public List<DoctorForm> loadDoctors() {
    //        System.out.println("size "+ doctorForms.size());
    //        return doctorForms;
    //    }
}
