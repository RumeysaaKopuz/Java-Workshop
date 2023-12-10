package com.example.rentacar.services.dtos.customer.request;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class AddCustomerRequest {
    private String firstName;
    private String lastName;
    private String eMail;
    private String identificationNumber;
    private String phone;
}
