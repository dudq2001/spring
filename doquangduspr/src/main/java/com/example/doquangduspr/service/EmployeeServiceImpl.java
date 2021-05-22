package com.example.doquangduspr.service;
import com.example.doquangduspr.entity.EmployeesEntity;
import com.example.doquangduspr.repository.EmployeesRepo;
import com.example.doquangduspr.entity.EmployeesEntity;
import com.example.doquangduspr.repository.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeesRepo employeesRepo;

    @Override
    public List<EmployeesEntity> getAll() {
        return employeesRepo.findAll();
    }

    @Override
    public EmployeesEntity createEmployees(EmployeesEntity p) {
        return employeesRepo.save(p);
    }

    @Override
    public EmployeesEntity updateEmployees(EmployeesEntity p) {
        return null;
    }



    @Override
    public List<EmployeesEntity> getProductByName(String name) {
        return null;
    }


    @Override
    public List<EmployeesEntity> finALlEmployee() {
        return null;
    }




}
