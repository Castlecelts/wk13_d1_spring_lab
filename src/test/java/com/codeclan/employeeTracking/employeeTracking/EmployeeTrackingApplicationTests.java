package com.codeclan.employeeTracking.employeeTracking;

import com.codeclan.employeeTracking.employeeTracking.Models.Employee;
import com.codeclan.employeeTracking.employeeTracking.Repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Employee employee = new Employee("Jane", 22, 1, "jane@gmail.com");
		employeeRepository.save(employee);
	}


}

