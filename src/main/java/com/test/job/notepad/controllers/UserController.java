package com.test.job.notepad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registration")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model) {
        return "login";
    }

}
