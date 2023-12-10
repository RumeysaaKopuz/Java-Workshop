package com.example.rentacar.services.dtos.location.request;

import lombok.Data;

@Data
public class UpdateLocationRequest {
    private int id;
    private String pickUpLocation;
    private String dropOffLocation;

}
