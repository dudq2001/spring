package com.example.doquangduspr.service;

import com.example.doquangduspr.entity.EmployeesEntity;

import java.util.List;

import com.example.doquangduspr.entity.EmployeesEntity;

import java.util.List;

public interface   EmployeeService {
    List<EmployeesEntity> getAll();
    EmployeesEntity createEmployees(EmployeesEntity p);
    EmployeesEntity  updateEmployees(EmployeesEntity p);
    List<EmployeesEntity> getProductByName(String name);
    List<EmployeesEntity>finALlEmployee();


}
