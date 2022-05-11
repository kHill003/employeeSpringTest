package com.codeclan.example.employeetraining.employeet;

import com.codeclan.example.employeetraining.employeet.models.Employee;
import com.codeclan.example.employeetraining.employeet.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

class EmployeeTrainingApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	@Test // NEW
	public void createEmployee(){ // NEW
		Employee sue =
				new Employee("Sue","Jones", 43, 1, "sueSmilth@gmail.com");
		employeeRepository.save(sue);
		Employee bill =
				new Employee("Bill","Gruff", 51, 2, "BGh@gmail.com");
		employeeRepository.save(bill);
		Employee doug =
				new Employee("Doug","Smith", 32, 3, "DSmith@gmail.com");
		employeeRepository.save(doug);
	}
}
