package com.development.todo1.service;

import com.development.todo1.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();
    ProductEntity save(ProductEntity productEntity);
    ProductEntity upDate(ProductEntity productEntity);
    ProductEntity delete(ProductEntity productEntity);
}
