package com.example.demo.utils;

import com.example.demo.dto.EmployerResponse;

import java.util.List;

public class EmployerData {
    private EmployerData(){}

    public static List<EmployerResponse> getEmployers() {
        return List.of(EmployerResponse.builder().name("Orejas").build(),
                EmployerResponse.builder().name("Puppy").build());
    }
}
