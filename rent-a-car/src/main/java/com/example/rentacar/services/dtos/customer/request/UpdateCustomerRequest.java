package com.example.rentacar.services.dtos.customer.request;

import lombok.Data;

@Data
public class UpdateCustomerRequest {
    private int id ;
    private String firstName;
    private String lastName;
    private String eMail;
    private String identificationNumber;
    private String phone;
}
