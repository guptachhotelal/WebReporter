package com.webreporter.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 *
 * @author Chhotelal
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String showHome() {
        return "home";
    }

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

    @RequestMapping(value = "/timer", method = RequestMethod.POST)
    public @ResponseBody
    String timer(final HttpServletRequest request, final HttpServletResponse response) {
        Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String dateString = "<span>" + df.format(new Date()) + "</span>";
        return dateString.substring(0, dateString.lastIndexOf(' '));
    }
}
