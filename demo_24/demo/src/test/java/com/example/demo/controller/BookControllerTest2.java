package com.example.demo.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @WebMvcTest 不需要制定在web环境下，但是，需要制定controllers，表示需要测试哪些控制器
 *
 * 这种方法只能测试controller，controller里面的一些依赖，需要自己mock
 * @WebMvcTest 这种方法测试不会加载整个spring容器，只会加载spring控制器
 */
@RunWith(SpringRunner.class)
//需要指定测试的控制器
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest2 {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk());
        mockMvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("home"));
    }

    @Test
    public void testShow() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book/show").param("id", "400")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("boot:400"));
    }
}
