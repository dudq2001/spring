package com.example.doquangdu_csw.repository;

import com.example.doquangdu_csw.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
