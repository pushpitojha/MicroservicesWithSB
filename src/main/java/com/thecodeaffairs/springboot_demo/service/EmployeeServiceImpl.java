package com.thecodeaffairs.springboot_demo.service;

import com.thecodeaffairs.springboot_demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();
    @Override
    public Employee addEmployee(Employee employee) {
        if(employee.getEmpId()==null || employee.getEmpId().isEmpty()) {
            employee.setEmpId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeList.stream().filter(e -> e.getEmpId().equals(id)).findFirst().get();
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee = employeeList.stream().filter(e -> e.getEmpId().equalsIgnoreCase(id)).findFirst().get();
        employeeList.remove(employee);
        return "Employee deleted with Id: " + id;
    }
}
