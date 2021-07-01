package com.example.doquangdu_csw.service;

import com.example.doquangdu_csw.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity createProduct(ProductEntity p);
    void deleteProduct(int id);
    ProductEntity updateProduct(ProductEntity p);
    List<ProductEntity> getProductByName(String name);


    static Object getProductByNameCustom(String name) {
        return null;
    }

    static Object getProductById(int parseInt) {
        return null;
    }

    Object getALlProduct();
}

