package com.example.payslip_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payslip {

    private int employeeId;
    private String employeeName;
    private int daysPresent;
    private double totalSalary;
}