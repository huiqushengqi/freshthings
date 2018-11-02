package com.yixin.freshthings.controller;

import com.yixin.freshthings.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/index")
    String home(){
        return "Hello world";
    }

}
