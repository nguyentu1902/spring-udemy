package com.cruddemo.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String lastName;

    @Column(name = "last_name")
    private String firstName;

    @Column(name = "email")
    private String email;
}
