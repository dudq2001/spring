package com.example.doquangdu_csw.service;

import com.example.doquangdu_csw.entity.ProductEntity;
import com.example.doquangdu_csw.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductServiceImp implements ProductService{

    @Autowired
    ProductRepo productRepo;


    @Override
    public List<ProductEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity createProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public ProductEntity updateProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public List<ProductEntity> getProductByName(String name) {
        return null;
    }

    @Override
    public Object getALlProduct() {
        return null;
    }
}