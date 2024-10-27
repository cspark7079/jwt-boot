package com.cspark.jwt_boot.mapper;

import com.cspark.jwt_boot.model.Employees;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeesMapper {
    List<Employees> selectEmployee();
}
