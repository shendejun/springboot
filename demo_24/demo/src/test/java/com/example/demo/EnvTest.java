package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
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
//也可以使用这种方式给测试环境添加一些配置项
@SpringBootTest(properties = {"app.version=1.0.0"})
public class EnvTest {
    @Autowired
    private Environment environment;

    /**
     * 还可以使用这种方式，测试未通过
     * https://blog.csdn.net/xybelieve1990/article/details/84783645
     * 搜索EnvironmentTestUtils
     */
//    @Before
//    public void init(){
//        EnvironmentTestUtils.addEnvironment(environment,"app.admin.user=zhangsan");
//    }

    @Test
    public void testValue(){
        Assert.assertEquals("springboottest",environment.getProperty("app.name"));
        Assert.assertEquals("1.0.0",environment.getProperty("app.version"));
    }
}
