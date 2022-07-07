package com.development.todo1.serviceImplement;

import com.development.todo1.dao.ProductsRespository;
import com.development.todo1.entity.ProductEntity;
import com.development.todo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplement implements ProductService {

    @Autowired
    protected ProductsRespository productsRespository;

    @Override
    public List<ProductEntity> findAll(){
        return this.productsRespository.findAll();
    }

    @Override
    public ProductEntity save(ProductEntity productEntity){
        return this.productsRespository.save(productEntity);
    }

    @Override
    public ProductEntity upDate(ProductEntity productEntity){
        return this.productsRespository.save(productEntity);
    }

    @Override
    public ProductEntity delete(ProductEntity productEntity){
        return this.productsRespository.save(productEntity);
    }
}
