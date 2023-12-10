package com.example.rentacar.services.dtos.vehicle.requests;

import com.example.rentacar.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddVehicleRequest {

    private String brand;
    private String model;
    private int year;
    private String color;
    private int categoryId;

}
