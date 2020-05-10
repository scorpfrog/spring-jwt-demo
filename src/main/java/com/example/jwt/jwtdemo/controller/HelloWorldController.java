package com.example.jwt.jwtdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String getGreeting() {
        return "Hello user!";
    }
}
