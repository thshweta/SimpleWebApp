package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){ //all mapping from server to client is handled by Front controller
        return "returns a login";
    }

    @RequestMapping("/login/user")
    public String user(){
        return "Returns a user";
    }

}
