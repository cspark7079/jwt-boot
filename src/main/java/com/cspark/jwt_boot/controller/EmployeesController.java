package com.cspark.jwt_boot.controller;

import com.cspark.jwt_boot.model.Employees;
import com.cspark.jwt_boot.service.EmployeesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeesController {
    private final EmployeesService employeesService;

    @GetMapping("/employees")
    @Operation(summary = "전체 직원 정보 조회", description = "전체 직원 정보 조회" ,security = @SecurityRequirement(name ="Bearer Authentication"))
    public ResponseEntity<List<Employees>> getAllUsers() {
        return ResponseEntity.ok().body(employeesService.getEmployees());
    }
}
