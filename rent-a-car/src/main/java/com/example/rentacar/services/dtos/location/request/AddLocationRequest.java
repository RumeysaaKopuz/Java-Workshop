package com.example.rentacar.services.dtos.location.request;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class AddLocationRequest {
    private String pickUpLocation;
    private String dropOffLocation;
}
