package com.example.rentacar.services.dtos.employee.response;

import lombok.Data;

@Data
public class GetAllEmployeeResponse {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String position;
}
