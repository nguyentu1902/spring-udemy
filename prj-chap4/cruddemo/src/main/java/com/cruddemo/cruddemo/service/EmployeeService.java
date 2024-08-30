package com.cruddemo.cruddemo.service;

import com.cruddemo.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
