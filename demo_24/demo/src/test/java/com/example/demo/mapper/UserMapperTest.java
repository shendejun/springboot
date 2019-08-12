package com.example.demo.mapper;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserMapperTest {
    //这个对象在springboot容器中并不存在的
    @MockBean
    private UserMapper userMapper;

    @Before
    public void init(){
        //预测行为，如输入admin返回1
        BDDMockito.given(userMapper.createUser("admin")).willReturn(Integer.valueOf(1));
        BDDMockito.given(userMapper.createUser("")).willReturn(Integer.valueOf(0));
        BDDMockito.given(userMapper.createUser(null)).willThrow(NullPointerException.class);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateUser(){
        //然后开始测试
        Assert.assertEquals(Integer.valueOf(1),userMapper.createUser("admin"));
        Assert.assertEquals(Integer.valueOf(0),userMapper.createUser(""));
        Assert.assertEquals(Integer.valueOf(0),userMapper.createUser(null));
    }
}
