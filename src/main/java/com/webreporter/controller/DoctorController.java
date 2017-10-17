package com.webreporter.controller;

import com.webreporter.entity.DoctorDegree;
import com.webreporter.entity.DoctorType;
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
public class DoctorController extends BaseController {

    @Resource
    private IDoctorService doctorService;

    @Resource
    private ITeamService teamService;

    @RequestMapping(value = "/doctorForm")
    public String showDoctorForm(@ModelAttribute("doctorForm") DoctorForm doctorForm, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        if (doctorForm.getId() > 0) {
            DoctorForm df = doctorService.findDoctorFormById(doctorForm.getId());
            map.addAttribute("doctorForm", df);
        }
        List<TeamForm> teamForms = teamService.listAllTeamForm();
        map.addAttribute("teamsList", teamForms);
        map.addAttribute("degrees", DoctorDegree.values());
        map.addAttribute("doctorTypes", DoctorType.values());
        return "doctorForm";
    }

    @RequestMapping(value = "/doctorForm", method = RequestMethod.POST)
    public String addDoctorForm(@ModelAttribute("doctorForm") DoctorForm doctorForm, HttpServletRequest request, HttpServletResponse response) {
        if (doctorForm.getId() > 0) {
            doctorService.updateDoctorForm(doctorForm);
        } else {
            doctorService.createDoctorForm(doctorForm);
        }
        return "redirect:doctorList.htm";
    }

    @RequestMapping(value = "/doctorList")
    public String listDoctors(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        List<DoctorForm> doctorList = doctorService.listAllDoctorForm();
        map.addAttribute("doctorList", doctorList);
        return "doctorList";
    }

    @RequestMapping(value = "/doctorByTeam")
    public String listDoctorsByTeam(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        String tid = request.getParameter("tid");
        if (tid != null && tid.trim().length() > 0) {
            long teamId = Long.parseLong(tid);
            TeamForm teamForm = teamService.findTeamFormById(teamId);
            List<DoctorForm> doctorList = doctorService.findDoctorFormsByTeam(teamId);
            map.addAttribute("teamForm", teamForm);
            map.addAttribute("doctorForms", doctorList);
        }
        return "doctorByTeam";
    }
}
