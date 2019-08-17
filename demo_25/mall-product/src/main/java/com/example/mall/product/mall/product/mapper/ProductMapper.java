package com.example.mall.product.mall.product.mapper;

import com.example.mall.product.mall.product.bean.Product;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface ProductMapper {
    public Integer add(Product product);
    public Integer delete(Integer id);
    public Integer update(Product product);
    public Product getById(Integer id);
    public List<Product> queryBiLists();
}
