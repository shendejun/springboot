package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Logger log = LoggerFactory.getLogger(UserService.class);
    public void log(){
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
