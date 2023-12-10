package com.example.rentacar.services.dtos.location.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetLocationResponse {
    private int id;
    private String pickUpLocation;
    private String dropOffLocation;

}
