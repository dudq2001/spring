package com.example.doquangduspr.repository;


import com.example.doquangduspr.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesRepo extends JpaRepository<EmployeesEntity, Integer> {
}
