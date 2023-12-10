package com.example.rentacar.services.dtos.vehicle.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllVehiclesResponse {
    private int id;
    private String brand;
    private String model;
    private int year;
    private int categoryId;

}
