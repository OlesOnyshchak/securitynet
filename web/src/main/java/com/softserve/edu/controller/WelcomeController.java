package com.softserve.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping(value = {"/"})
    public String showWelcomePage() {
        return "app/index.html";
    }
}
