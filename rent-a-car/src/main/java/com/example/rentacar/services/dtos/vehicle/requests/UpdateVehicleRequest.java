package com.example.rentacar.services.dtos.vehicle.requests;

import lombok.Data;

@Data
public class UpdateVehicleRequest {
    private int id;
    private String brand;
    private String model;
    private int year;
    private int categoryId;
}
