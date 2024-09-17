package com.ngt.cruddemo.service;

import com.ngt.cruddemo.DAO.StudentDAO;
import com.ngt.cruddemo.entity.StudentEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;

    public void save(List<StudentEntity> entityList){
        entityList.forEach(studentDAO::save);
    }
}
