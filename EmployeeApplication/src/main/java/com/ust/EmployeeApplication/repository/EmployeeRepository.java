package com.ust.EmployeeApplication.repository;

import com.ust.EmployeeApplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByProjectId(Long projectId);

    @Query("SELECT COUNT(e) FROM Employee e WHERE e.project.id = ?1 AND e.interview.passed = false")
    long countByProjectIdAndInterviewPassedFalse(Long projectId);
}