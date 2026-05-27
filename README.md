# Spring Boot Microservices Assignment

This project contains 3 Spring Boot microservices:

1. Employee Service
2. Attendance Service
3. Payslip Service

## Technologies Used

- Java
- Spring Boot
- MySQL
- Maven
- REST API

---

## Services

### Employee Service
- Stores employee details
- Uses MySQL database

### Attendance Service
- Returns attendance data
- Uses hardcoded values

### Payslip Service
- Calculates employee salary
- Connects Employee + Attendance services

---

## API Endpoints

### Employee Service
GET /employees/{id}

### Attendance Service
GET /attendance/{employeeId}

### Payslip Service
GET /payslip/{employeeId}

