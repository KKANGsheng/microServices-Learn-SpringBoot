package com.kang.controller;


import com.kang.modal.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/getSpecialCustomer")
    public User getUser(){
        User user= new User();
        user.setFullName("kang sheng");
        user.setEmail("kangsheng0721@gmail.com");
        user.setRole("customer");
        user.setPhoneNumber("0176996557");
        return user;
    }
}
