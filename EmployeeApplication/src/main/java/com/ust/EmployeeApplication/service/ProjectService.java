package com.ust.EmployeeApplication.service;

import com.ust.EmployeeApplication.model.Project;
import com.ust.EmployeeApplication.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}
