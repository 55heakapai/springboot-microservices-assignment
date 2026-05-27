package com.example.payslip_service.service;

import com.example.payslip_service.model.Attendance;
import com.example.payslip_service.model.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayslipServiceTest {

    PayslipService payslipService = new PayslipService();

    @Test
    void testSalaryCalculation1() {
        Employee employee = new Employee();
        employee.setSalaryPerDay(1000);

        Attendance attendance = new Attendance();
        attendance.setDaysPresent(20);

        double result = payslipService.calculateSalary(employee, attendance);

        assertEquals(20000, result);
    }

    @Test
    void testSalaryCalculation2() {
        Employee employee = new Employee();
        employee.setSalaryPerDay(1500);

        Attendance attendance = new Attendance();
        attendance.setDaysPresent(10);

        double result = payslipService.calculateSalary(employee, attendance);

        assertEquals(15000, result);
    }
}