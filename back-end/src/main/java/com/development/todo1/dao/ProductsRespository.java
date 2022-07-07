package com.development.todo1.dao;

import com.development.todo1.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRespository extends JpaRepository<ProductEntity, Long> {
}
