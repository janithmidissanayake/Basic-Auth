package com.example.demo.controller;

import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
   private final EmployeeService employeeService;
//
////    @PostMapping
////    @ResponseStatus(HttpStatus.CREATED)
////    public EmployeeResponseDto createEmployee(final @Valid @RequestBody EmployeeRequestDto employeeRequestDto)
////    {
////     return employeeService.createEmployee(employeeRequestDto);
////
////    }
//
    @PostMapping
    public ResponseEntity< EmployeeResponseDto> createEmployee(final @Valid @RequestBody EmployeeRequestDto employeeRequestDto) {
        return new ResponseEntity<>(this.employeeService.createEmployee(employeeRequestDto) ,HttpStatus.CREATED);
    }
}

