package com.development.todo1.controller;

import com.development.todo1.entity.ProductEntity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    List<ProductEntity> lista = new ArrayList<ProductEntity>();

    @Test
    void list() {
        ProductEntity product = new ProductEntity("jose","es alto","http://img",1,2.555F,true);
        String expected = product.getName();
        assertEquals(expected.length(),4);
    }

    @Test
    void save() {
        ProductEntity product = new ProductEntity("jose","es alto","http://img",1,2.555F,true);
        this.lista.add(product);
        int expected = this.lista.size();
        assertEquals(expected,1);
    }

    @Test
    void update() {
        ProductEntity product = new ProductEntity("jose","es alto","http://img",1,2.555F,true);
        int name = product.getName().length();
        product.setName("dado");
        int expected = product.getName().length();
        int actual = name;
        assertEquals(expected,actual);
    }

    @Test
    void delete() {
        ProductEntity product = new ProductEntity("jose","es alto","http://img",1,2.555F,true);
        boolean state = product.getState();
        product.setState(false);
        boolean expected = product.getState();
        boolean actual = state;
        assertNotEquals(expected,actual);
    }
}