package org.perscholas.gig10.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ProfileController {
    @RequestMapping(value="/profile", method= RequestMethod.GET)
    public String getProfile(ModelMap model) {

        return "profile";

    }
}
