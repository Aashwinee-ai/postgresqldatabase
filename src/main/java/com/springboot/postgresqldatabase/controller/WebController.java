package com.springboot.postgresqldatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "login Success";
    }

}