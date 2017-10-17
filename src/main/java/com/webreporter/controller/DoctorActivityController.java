package com.webreporter.controller;

import com.webreporter.form.DoctorActivityForm;
import com.webreporter.form.DoctorForm;
import com.webreporter.service.IActivityService;
import com.webreporter.service.IDoctorService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Chhotelal
 */
@Controller
public class DoctorActivityController {

    @Resource
    private IDoctorService doctorService;

    @Resource
    private IActivityService activityService;

    @RequestMapping(value = "/doctorActivity")
    public String assignDoctorActivity(@ModelAttribute("doctorActivity") DoctorActivityForm doctorActivityForm, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        if (request.getParameter("dId") != null) {
            DoctorForm df = doctorService.findDoctorFormById(Long.parseLong(request.getParameter("dId")));
            DoctorActivityForm daf = new DoctorActivityForm();
            daf.setDoctorForm(df);
            daf.setActivityForms(activityService.listAllActivityForm());
            map.addAttribute("doctorActivity", daf);
        }
        return "doctorActivity";
    }
}
