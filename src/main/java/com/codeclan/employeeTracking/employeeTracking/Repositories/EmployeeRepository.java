package com.codeclan.employeeTracking.employeeTracking.Repositories;

import com.codeclan.employeeTracking.employeeTracking.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
