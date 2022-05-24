package com.okanga.myemployeesystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
