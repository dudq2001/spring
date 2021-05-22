package com.example.doquangduspr.controller;

import com.example.doquangduspr.entity.EmployeesEntity;
import com.example.doquangduspr.model.BaseResponse;
import com.example.doquangduspr.service.EmployeeService;
import com.example.doquangduspr.entity.EmployeesEntity;
import com.example.doquangduspr.model.BaseResponse;
import com.example.doquangduspr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getProduct(@RequestParam(value = "name", required = false) String name) {
        BaseResponse res = new BaseResponse();
        if (name != null){
            res.data = employeeService.getProductByName(name);
        }else {
            res.data = employeeService.getAll();
        }
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createEmployees(@RequestBody EmployeesEntity p){
        EmployeesEntity data = employeeService.createEmployees(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }



}
