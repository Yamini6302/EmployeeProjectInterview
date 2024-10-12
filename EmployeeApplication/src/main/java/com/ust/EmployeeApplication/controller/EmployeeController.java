package com.ust.EmployeeApplication.controller;

import com.ust.EmployeeApplication.model.Employee;
import com.ust.EmployeeApplication.model.Interview;
import com.ust.EmployeeApplication.model.Project;
import com.ust.EmployeeApplication.service.EmployeeService;
import com.ust.EmployeeApplication.service.InterviewService;
import com.ust.EmployeeApplication.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private InterviewService interviewService;

    @GetMapping("/project/{projectId}")
    public List<Employee> getEmployeesInProject(@PathVariable Long projectId) {
        return employeeService.getEmployeesInProject(projectId);
    }

    @GetMapping("/project/{projectId}/failed-interviews")
    public long countFailedInterviews(@PathVariable Long projectId) {
        return employeeService.countFailedInterviewsInProject(projectId);
    }

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // New endpoint to add a Project
    @PostMapping("/project/add")
    public Project createProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    // New endpoint to add an Interview
    @PostMapping("/interview/add")
    public Interview createInterview(@RequestBody Interview interview) {
        return interviewService.saveInterview(interview);
    }
}