package com.webreporter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Chhotelal
 */
@Controller
public class HomeController extends BaseController {

    //    @RequestMapping(value = "/home")
    //    public String showHome() {
    //        return "home";
    //    }
    @RequestMapping(value = "/doctors")
    public String showDoctors() {
        return "doctors";
    }

    @RequestMapping(value = "/myTeam")
    public String showMyTeam() {
        return "myTeam";
    }

    @RequestMapping(value = "/myActivities")
    public String showMyActivities() {
        return "myActivities";
    }
}
