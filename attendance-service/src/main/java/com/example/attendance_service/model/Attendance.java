package com.example.attendance_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {

    private int employeeId;
    private int daysPresent;
    public int getDaysPresent() {
        return daysPresent;
    }
}