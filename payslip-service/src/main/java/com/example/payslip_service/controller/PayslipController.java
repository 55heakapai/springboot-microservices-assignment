package com.example.payslip_service.controller;

import com.example.payslip_service.model.Attendance;
import com.example.payslip_service.model.Employee;
import com.example.payslip_service.model.Payslip;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payslip")
public class PayslipController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public Payslip generatePayslip(@PathVariable int id) {

        Employee employee = restTemplate.getForObject(
                "http://localhost:8081/employee/" + id,
                Employee.class
        );

        Attendance attendance = restTemplate.getForObject(
                "http://localhost:8082/attendance/" + id,
                Attendance.class
        );

        double totalSalary =
                employee.getSalaryPerDay() *
                        attendance.getDaysPresent();

        return new Payslip(
                employee.getId(),
                employee.getName(),
                attendance.getDaysPresent(),
                totalSalary
        );
    }
}