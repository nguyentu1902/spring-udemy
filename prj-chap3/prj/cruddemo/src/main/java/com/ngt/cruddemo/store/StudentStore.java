package com.ngt.cruddemo.store;

import com.ngt.cruddemo.DAO.StudentDAO;
import com.ngt.cruddemo.entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class StudentStore implements StudentDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(StudentEntity student) {
        entityManager.persist(student);
    }
}
