package com.sweng.passportmgr.controller;

/**
 * Created by zanwar on 3/2/2017.
 */
import com.sweng.passportmgr.model.Passport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
public class PassportController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/passport")
    public String addpassport(ModelMap modelMap) {
        Passport myPassport = new Passport(1, "zahid", "anwar", "zanwar@fontbonne.edu");
        modelMap.put("passport", myPassport);
        return "passport_detail";
    }
}

