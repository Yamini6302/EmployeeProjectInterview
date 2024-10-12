package com.ust.EmployeeApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean passed;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}