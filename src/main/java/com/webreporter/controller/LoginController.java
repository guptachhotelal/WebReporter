package com.webreporter.controller;

import com.webreporter.form.LoginForm;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Chhotelal
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login.htm")
    public String login(@ModelAttribute("loginForm") LoginForm loginForm) {
        return "common/login";
    }

    @RequestMapping(value = "home.htm")
    public String showHome(@ModelAttribute("loginForm") LoginForm loginForm) {
        //loginService.createLogin(loginForm);
        return "home";
    }

    @RequestMapping(value = "logout.htm")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
}
