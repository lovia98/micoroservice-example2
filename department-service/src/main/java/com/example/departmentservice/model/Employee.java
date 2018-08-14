package com.example.departmentservice.model;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Employee {

    private Long id;
    private String name;
    private int age;
    private String position;
}
