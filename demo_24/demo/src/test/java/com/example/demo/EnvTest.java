package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot会有限加载测试环境下的配置文件（Application.properties）
 * 测试环境下没有才会加载正式环境下的配置文件
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvTest {
    @Autowired
    private Environment environment;

    @Test
    public void testValue(){
        Assert.assertEquals("springboot",environment.getProperty("app.name"));
    }
}
