package com.example.rentacar.services.dtos.vehicle.responses;

import lombok.Data;

@Data
public class GetVehicleResponse {
    private int id;
    private String brand;
    private String model;
    private int year;
    private int categoryId;
    private String category;


}
