package com.codeclan.example.employeetraining.employeet.controllers;
import java.util.List;
import java.util.Optional;

import com.codeclan.example.employeetraining.employeet.models.Employee;
import com.codeclan.example.employeetraining.employeet.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllPirates() {
        return employeeRepository.findAll();

    }

}
