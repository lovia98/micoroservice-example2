package com.example.employeeeurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Value("${batch-file}")
    private String batchFileLocation;

    @GetMapping
    public String list() {
        return batchFileLocation;
    }
}
