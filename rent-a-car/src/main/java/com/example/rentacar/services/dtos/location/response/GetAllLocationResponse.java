package com.example.rentacar.services.dtos.location.response;

import lombok.Data;

@Data
public class GetAllLocationResponse {
    private int id;
    private String pickUpLocation;
    private String dropOffLocation;

}
