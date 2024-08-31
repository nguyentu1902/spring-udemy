package com.ngt.cruddemo.rest;

import com.ngt.cruddemo.entity.StudentEntity;
import com.ngt.cruddemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/cruddemo/user")
public class StudentResource {
    @Autowired
    private StudentService service;

//    @GetMapping("/find")
//    public List<StudentEntity> get(){
//
//    }

    @PostMapping("/save")
    public void save(List<StudentEntity> entityList){
        service.save(entityList);
    }
}
