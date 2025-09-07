package com.example.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello!! Welcome to a Simple Web App";
    }

    @RequestMapping("/about")
    public String about(){
        return "returning information";
    }

    @RequestMapping("/about/info")
    public String info(){
        return "returning information";
    }

}
