package com.example.demo.repository;

import com.example.demo.entity.CatalogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<CatalogsEntity, Integer> {

}
