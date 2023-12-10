package com.example.rentacar.services.dtos.employee.request;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class AddEmployeeRequest {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
}
