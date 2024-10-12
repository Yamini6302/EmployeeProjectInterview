package com.ust.EmployeeApplication.service;

import com.ust.EmployeeApplication.model.Employee;
import com.ust.EmployeeApplication.repository.EmployeeRepository;
import com.ust.EmployeeApplication.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public List<Employee> getEmployeesInProject(Long projectId) {
        return employeeRepository.findByProjectId(projectId);
    }

    public long countFailedInterviewsInProject(Long projectId) {
        return employeeRepository.countByProjectIdAndInterviewPassedFalse(projectId);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
