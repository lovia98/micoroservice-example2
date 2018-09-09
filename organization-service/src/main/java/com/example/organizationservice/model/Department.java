package com.example.organizationservice.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Department {

    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        super();
        this.name = name;
    }
}
