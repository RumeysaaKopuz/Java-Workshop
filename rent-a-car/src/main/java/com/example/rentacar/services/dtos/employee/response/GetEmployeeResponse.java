package com.example.rentacar.services.dtos.employee.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetEmployeeResponse  {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String position;
}
