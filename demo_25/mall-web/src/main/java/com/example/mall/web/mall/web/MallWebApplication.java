package com.example.mall.web.mall.web;

import com.example.mall.web.mall.web.bean.Product;
import com.example.mall.web.mall.web.bean.Response;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 调用方法
 * 服务提供的是什么服务，rest(http),web service,rpc
 * rest RestTemplate,httpClient
 *
 * 微服务
 * 把原先的一个大的系统，拆分成小的系统
 * 每个小系统分别开发，测试，维护
 *
 */
//@SpringBootApplication
public class MallWebApplication {

    static String BASE_URL = "http://localhost:8082";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String body = restTemplate.getForObject(BASE_URL + "/soa/product/1", String.class);
        System.out.println(body);
        Map<String ,Object> map= new Gson().fromJson(body,Map.class);
        Product product = new Gson().fromJson(map.get("data").toString(),Product.class);
        System.out.println(product.getClass());
    }

}
