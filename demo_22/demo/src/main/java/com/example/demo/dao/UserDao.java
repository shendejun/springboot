package com.example.demo.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    private Logger log = LoggerFactory.getLogger(UserDao.class);
    public void log(){
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
