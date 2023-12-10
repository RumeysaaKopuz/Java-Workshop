package com.example.rentacar.services.dtos.customer.response;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class GetAllCustomerResponse {
    private int id ;
    private String firstName;
    private String lastName;
}
