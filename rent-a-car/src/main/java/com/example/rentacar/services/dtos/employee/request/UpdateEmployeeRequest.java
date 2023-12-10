package com.example.rentacar.services.dtos.employee.request;

import lombok.Data;

@Data
public class UpdateEmployeeRequest {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String position;
}
