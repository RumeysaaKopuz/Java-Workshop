package com.example.rentacar.services.dtos.customer.response;

import lombok.Data;

@Data
public class GetCustomerResponse {
    private int id ;
    private String firstName;
    private String lastName;
}
