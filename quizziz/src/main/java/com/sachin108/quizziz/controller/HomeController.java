package com.sachin108.quizziz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @GetMapping("/")
    public String Home(){
        return "home";
    }    
}
