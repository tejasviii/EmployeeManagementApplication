package com.geekster.EmployeeManagementApplication.Controller;

import com.geekster.EmployeeManagementApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/logIn") // ✅
    private ResponseEntity<String> login(@RequestParam String employeeUserName, @RequestParam String employeePassword){
        String response = employeeService.logIn(employeeUserName, employeePassword);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
