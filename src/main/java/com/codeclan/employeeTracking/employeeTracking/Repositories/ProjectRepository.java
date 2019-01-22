package com.codeclan.employeeTracking.employeeTracking.Repositories;

import com.codeclan.employeeTracking.employeeTracking.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
