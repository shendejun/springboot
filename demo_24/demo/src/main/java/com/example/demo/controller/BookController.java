package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book/home")
    public String home(){
        System.out.println("/book/home url is invoke");
        return "home";
    }
}
