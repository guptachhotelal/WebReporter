package com.webreporter.controller;

import com.webreporter.form.ActivityForm;
import com.webreporter.service.IActivityService;
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
public class ActivityController {

    @Resource
    private IActivityService activityService;

    @RequestMapping(value = "/activityForm")
    public String showActivityForm(@ModelAttribute("activityForm") ActivityForm activityForm, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        if (activityForm.getAid() > 0) {
            ActivityForm af = activityService.findActivityFormById(activityForm.getAid());
            map.addAttribute("activityForm", af);
        }
        return "activityForm";
    }

    @RequestMapping(value = "/activityForm", method = RequestMethod.POST)
    public String addUpdateActivityForm(@ModelAttribute("activityForm") ActivityForm activityForm, HttpServletRequest request, HttpServletResponse response) {
        if (activityForm.getAid() > 0) {
            activityService.updateActivity(activityForm);
        } else {
            activityService.createActivityForm(activityForm);
        }
        return "redirect:activityList.htm";
    }

    @RequestMapping(value = "/activityList")
    public String listDoctors(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        List<ActivityForm> activityList = activityService.listAllActivityForm();
        map.addAttribute("activityList", activityList);
        return "activityList";
    }
}
