package com.example.doquangduspr.controller;

import com.example.doquangduspr.entity.EmployeesEntity;
import com.example.doquangduspr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class EmController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<EmployeesEntity> employees = employeeService.getAll();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping({"/create"})
    public String add(Model model){
        model.addAttribute("employee", new EmployeesEntity());
        return "create";
    }

    @PostMapping(value = "/add")
    public String addProduct(@ModelAttribute EmployeesEntity employee, Model model){
        employeeService.createEmployees(employee);
        model.addAttribute("employees", employeeService.getAll());
        return "redirect:index";
    }
}