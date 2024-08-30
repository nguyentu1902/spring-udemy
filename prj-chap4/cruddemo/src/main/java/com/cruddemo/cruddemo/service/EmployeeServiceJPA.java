package com.cruddemo.cruddemo.service;

import com.cruddemo.cruddemo.entity.Employee;
import com.cruddemo.cruddemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceJPA {
    
    @Autowired
    private EmployeeRepository repository;
    
    public List<Employee> getAll() {
        return repository.findAll();
    }
    
    public Employee findById(int id) {
        Optional<Employee> rs = repository.findById(id);
        Employee employee = null;
        if(rs.isPresent()){
            employee = rs.get();
        }
        else {
            throw new RuntimeException("Not found employee id - " + id);
        }
        return employee;
    }

    @Transactional
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
