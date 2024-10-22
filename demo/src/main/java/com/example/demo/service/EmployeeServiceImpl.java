package com.example.demo.service;

import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {
        final Employee employee = UserMapper.toEntity(employeeRequestDto);
        final Employee result = this.employeeRepository.save(employee);
        return UserMapper.toDtoResponse(result);
    }
}
