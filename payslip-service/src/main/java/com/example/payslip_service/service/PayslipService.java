package com.example.payslip_service.service;

import com.example.payslip_service.model.Attendance;
import com.example.payslip_service.model.Employee;

import org.springframework.stereotype.Service;

@Service
public class PayslipService {

    public double calculateSalary(
            Employee employee,
            Attendance attendance){

        return employee.getSalaryPerDay()
                * attendance.getDaysPresent();
    }
}