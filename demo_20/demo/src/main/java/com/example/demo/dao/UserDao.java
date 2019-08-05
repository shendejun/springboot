package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void add(String username,String password){
        System.out.println("add [username:]"+username+",password:"+password+"]");
    }
}
