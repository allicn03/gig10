package org.perscholas.gig10.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class DashboardController {
    @RequestMapping(value="/dashboard", method= RequestMethod.GET)
    public String getDashboard(ModelMap model) {

        return "dashboard";

    }
}
