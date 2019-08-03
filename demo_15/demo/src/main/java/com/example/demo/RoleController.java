package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在springboot 中使用jsp，需要另外tomcat-embed-jasper的依赖
 * 然后需要在配置文件中，配置如下两个配置：
 * spring.mvc.view.prefix=/WEB-INF/jsp
 * spring.mvc.view.suffix=.jsp
 * 方法的返回值，是jsp的路径加文件名
 * 最后，不能使用@RestController注解，需要使用@Controller
 */
@Controller
@RequestMapping("role")
public class RoleController {
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("role","角色");
        return "/role/index";
    }
}
