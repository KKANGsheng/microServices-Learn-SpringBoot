package com.kang.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello world bro")
    public String HomeController(){
        return "User microservices for salon booking system";
    }
}
