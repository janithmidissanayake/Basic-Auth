package com.example.demo.controller;

import com.example.demo.dto.EmployerResponse;
import com.example.demo.utils.EmployerData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
    @GetMapping
    public List<EmployerResponse> retrieveEmployers() {
        return EmployerData.getEmployers();
    }
}
