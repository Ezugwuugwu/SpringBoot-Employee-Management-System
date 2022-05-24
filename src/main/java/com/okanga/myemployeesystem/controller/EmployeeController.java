package com.okanga.myemployeesystem.controller;

import com.okanga.myemployeesystem.entity.EmployeeEntity;
import com.okanga.myemployeesystem.models.Employee;
import com.okanga.myemployeesystem.repository.EmployeeRepository;
import com.okanga.myemployeesystem.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/vi")
public class EmployeeController {

    private final EmployeeService employeeService;
    private EmployeeRepository repository;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create_employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/get_all_employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        boolean deleted = false;
        deleted = employeeService.deleteEmployee(id);

    Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted Successfully", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){

        Employee employee = null;
        employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){

        employee = employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok(employee);
    }
}
