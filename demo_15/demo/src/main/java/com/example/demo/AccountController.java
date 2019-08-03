package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 在springboot中使用freemarker的步骤
 * 1、在pom.xml里引入依赖spring-boot-starter-freemarker
 * 2、默认的freemarker的模板文件在classpath:/templates/,默认的文件扩展名为：ftl
 * spring.freemarker.templateLoaderPath=classpath:/ftl
 */
@Controller
public class AccountController {
    @GetMapping("/reg")
    public String reg(){
        return "/reg";
    }
}
