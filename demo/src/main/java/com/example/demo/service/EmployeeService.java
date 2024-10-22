package com.example.demo.service;

import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;

public interface EmployeeService {
    public EmployeeResponseDto createEmployee (final EmployeeRequestDto employeeRequestDto);
}
