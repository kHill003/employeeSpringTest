package com.codeclan.example.employeetraining.employeet.repositories;
import org.springframework.stereotype.Repository;
import com.codeclan.example.employeetraining.employeet.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}