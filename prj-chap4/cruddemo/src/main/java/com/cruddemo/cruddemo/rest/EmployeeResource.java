package com.cruddemo.cruddemo.rest;

import com.cruddemo.cruddemo.dao.EmployeeDAO;
import com.cruddemo.cruddemo.entity.Employee;
import com.cruddemo.cruddemo.service.EmployeeService;
import com.cruddemo.cruddemo.service.EmployeeServiceJPA;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    private  EmployeeServiceJPA serviceJPA;


    @GetMapping("/")
    public List<Employee> getAll(){
        return serviceJPA.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id){
        Employee employee = serviceJPA.findById(id);
        if(employee == null){
            throw  new RuntimeException("Id not found " + id);
        }
        return employee;
    }

    @PostMapping("/")
    public Employee add(@RequestBody Employee employee){
        return serviceJPA.save(employee);
    }

    @PutMapping("/")
    public Employee save(@RequestBody Employee employee){
        return serviceJPA.save(employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        Employee employee = serviceJPA.findById(id);
        if (employee == null) {
            throw new RuntimeException("Id not found " + id);
        }
        serviceJPA.deleteById(id);

        return "deleted employee id:" + id;
    }
}
