package com.example.mall.product.mall.product.controller;

import com.example.mall.product.mall.product.bean.Product;
import com.example.mall.product.mall.product.mapper.ProductMapper;
import com.example.mall.product.mall.product.web.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

/**
 * product rest 服务
 */
@RestController
public class ProductController {
//    @Autowired
    private ProductMapper productMapper;

    @PostMapping("/soa/product/add")
    public Object add(Product product) {
//        Integer count = productMapper.add(product);
//        if (count == null) {
//            return new Response("500", "Fail", null);
//        }
        return new Response("200", "OK", null);
    }

    @PutMapping("/soa/product/update")
    public Object update(Product product){
//        Integer res = productMapper.update(product);
//        return res == 1 ? new Response("200", "OK", null) : new Response("500", "Fail", null);
        return new Response("200", "OK", null);
    }

    @DeleteMapping("/soa/product/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        Integer res =1;
        return res == 1 ? new Response("200", "OK", null) : new Response("500", "Fail", null);
    }

    @GetMapping("/soa/product/{id}")
    public Object get(@PathVariable("id") Integer id) {
//        Product product = productMapper.getById(id);
        Product product = new Product();
        product.setPid(1);
        product.setPname("商品A");
        product.setPrice(10.2d);
        product.setType("4700");
        product.setCreateTime(new Timestamp(new Date().getTime()));
        return new Response("200", "OK", product);
    }

    @GetMapping("/soa/products")
    public Object list() {
        return new Response("200", "OK", productMapper.queryBiLists());
    }
}
