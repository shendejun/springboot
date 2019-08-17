package com.example.mall.product.mall.product;

import com.example.mall.product.mall.product.bean.Product;
import com.example.mall.product.mall.product.mapper.ProductMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext= SpringApplication.run(MallProductApplication.class, args);
        //springboot集成mybatis环境（未测试）
//        ProductMapper productMapper = applicationContext.getBean(ProductMapper.class);
//        Product product = new Product();
//        product.setPid(1);
//        //...
//        productMapper.add(product);
        applicationContext.close();
    }

}
