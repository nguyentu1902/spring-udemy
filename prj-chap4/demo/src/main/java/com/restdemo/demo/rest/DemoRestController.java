package com.restdemo.demo.rest;

import com.restdemo.demo.entity.Student;
import com.restdemo.demo.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@AllArgsConstructor
public class DemoRestController {

    private final List<Student> lstStudent;

    @PostConstruct
    public void setData(){
        lstStudent.add(new Student("A1", "B1"));
        lstStudent.add(new Student("A2", "B2"));
        lstStudent.add(new Student("A3", "B3"));
        lstStudent.add(new Student("A4", "B4"));
    }

    @GetMapping("/get")
    public List<Student> getListStudent(){
        setData();
        return lstStudent;
    }

    @GetMapping("/get/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        if(studentId >= lstStudent.size() || studentId < 0){
            throw new StudentNotFoundException("Student is not found - " + studentId);
        }
        return lstStudent.get(studentId);
    }


}
