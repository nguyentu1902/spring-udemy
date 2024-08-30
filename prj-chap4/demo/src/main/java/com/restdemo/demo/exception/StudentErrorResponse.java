package com.restdemo.demo.exception;

import lombok.Data;

@Data
public class StudentErrorResponse {
    private int status;
    private String message;
}
