package com.cspark.jwt_boot.controller;

import com.cspark.jwt_boot.model.Employees;
import com.cspark.jwt_boot.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeesController {
    private final EmployeesService employeesService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employees>> getAllUsers() {
        return ResponseEntity.ok().body(employeesService.getEmployees());
    }
}
