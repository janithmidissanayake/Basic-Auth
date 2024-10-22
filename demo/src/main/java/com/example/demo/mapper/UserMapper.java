package com.example.demo.mapper;

import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.model.Employee;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserMapper {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    //Mapping from UserRequestDTO to Employee Entity
    public static Employee toEntity (EmployeeRequestDto requestDto) {
        return Employee.builder()
                .username(requestDto.getUsername())
                .password(encoder.encode(requestDto.getPassword()))
                .name(requestDto.getName())
                .build();
    }

    // Mapping from PetOwner Entity to UserResponseDTO

    public static EmployeeResponseDto toDtoResponse (Employee entity) {
        return EmployeeResponseDto.builder()
                .username(entity.getUsername())
                .build();

    }


}
