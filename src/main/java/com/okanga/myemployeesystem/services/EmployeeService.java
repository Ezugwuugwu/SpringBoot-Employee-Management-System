package com.okanga.myemployeesystem.services;

import com.okanga.myemployeesystem.entity.EmployeeEntity;
import com.okanga.myemployeesystem.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
