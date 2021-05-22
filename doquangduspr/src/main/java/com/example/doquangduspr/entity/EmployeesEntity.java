package com.example.doquangduspr.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage =wage;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private int wage;

}
