package com.ust.EmployeeApplication.service;

import com.ust.EmployeeApplication.model.Interview;
import com.ust.EmployeeApplication.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {

    @Autowired
    private InterviewRepository interviewRepository;

    public Interview saveInterview(Interview interview) {
        return interviewRepository.save(interview);
    }
}