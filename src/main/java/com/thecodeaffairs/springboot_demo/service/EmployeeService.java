package com.thecodeaffairs.springboot_demo.service;

import com.thecodeaffairs.springboot_demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
