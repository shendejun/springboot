package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/book/home")
    public String home(){
        System.out.println("/book/home url is invoke");
        return "home";
    }

    @GetMapping("/book/show")
    public String show(@RequestParam("id")String id){
        userDao.addUser("");
        System.out.println("/book/show url is invoke");
        return "boot:"+id;
    }
}
