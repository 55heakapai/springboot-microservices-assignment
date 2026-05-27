package com.example.attendance_service.controller;

import com.example.attendance_service.model.Attendance;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @GetMapping("/{employeeId}")
    public Attendance getAttendance(@PathVariable int employeeId) {

        if(employeeId == 1) {
            return new Attendance(1, 20);
        }
        else if(employeeId == 2) {
            return new Attendance(2, 22);
        }
        else if(employeeId == 3) {
            return new Attendance(3, 18);
        }
        else if(employeeId == 4) {
            return new Attendance(4, 25);
        }

        return new Attendance(employeeId, 15);
    }
}
//package com.example.attendance_service.controller;
//
//import com.example.attendance_service.model.Attendance;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/attendance")
//public class AttendanceController {
//
//    @GetMapping("/{employeeId}")
//    public Attendance getAttendance(@PathVariable int employeeId) {
//
//        return new Attendance(
//                employeeId,
//                24
//        );
//    }
//}