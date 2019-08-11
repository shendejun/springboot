package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String index(){
        return "index";
    }

    @GetMapping("/getUserById")
    public String getUserById(Integer id){
        return id+":id";
    }
}
