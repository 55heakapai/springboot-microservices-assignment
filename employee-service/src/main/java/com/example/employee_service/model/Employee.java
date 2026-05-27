package com.example.employee_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private int id;

    private String name;

    private double salaryPerDay;
    public double getSalaryPerDay() {
        return salaryPerDay;
    }
}