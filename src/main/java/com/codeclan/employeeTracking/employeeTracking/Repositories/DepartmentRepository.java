package com.codeclan.employeeTracking.employeeTracking.Repositories;

import com.codeclan.employeeTracking.employeeTracking.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
