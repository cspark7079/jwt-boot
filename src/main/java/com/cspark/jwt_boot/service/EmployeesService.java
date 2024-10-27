package com.cspark.jwt_boot.service;

import com.cspark.jwt_boot.mapper.EmployeesMapper;
import com.cspark.jwt_boot.model.Employees;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesService {
    private final EmployeesMapper employeesMapper;

    public List<Employees> getEmployees() {
        return employeesMapper.selectEmployee();
    }
}
