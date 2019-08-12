package com.example.demo.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TestRestTemplate 需要运行在web环境中
 * 这种方式会加载整个spring容器
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

    /**
     * 需要使用这个工具
     */
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testHome(){
        String content = testRestTemplate.getForObject("/book/home",String.class);
        Assert.assertEquals("home",content);
    }

    @Test
    public void testShow(){
        String content = testRestTemplate.getForObject("/book/show?id=100",String.class);
        Assert.assertEquals("boot:100",content);
    }
}
