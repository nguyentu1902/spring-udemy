package com.cruddemo.cruddemo.dao;

import com.cruddemo.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
