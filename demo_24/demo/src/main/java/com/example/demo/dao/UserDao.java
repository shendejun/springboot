package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public Integer addUser(String username){
        System.out.println("user dao adduser[username="+username+"]");
        if (username==null){
            return 0;
        }
        return 1;
    }
}
