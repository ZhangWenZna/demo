package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cn")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/age",  method = RequestMethod.GET )
    public int getAgeOfUser(){
        return userService.getAgeByUsername("springbootdemo");
    }
}
