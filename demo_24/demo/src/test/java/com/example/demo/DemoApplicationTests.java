package com.example.demo;

import com.example.demo.bean.User;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoads() {
    }

    /**
     * 测试bean是否已装配
     */
    @Test
    public void testNull(){
        Assert.assertNotNull(context.getBean(User.class));
    }

}
