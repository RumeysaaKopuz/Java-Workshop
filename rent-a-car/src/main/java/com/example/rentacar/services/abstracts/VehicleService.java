package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.vehicle.requests.AddVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.requests.UpdateVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.responses.GetAllVehiclesResponse;
import com.example.rentacar.services.dtos.vehicle.responses.GetVehicleResponse;

import java.util.List;

public interface VehicleService {

    void add(AddVehicleRequest request);
    void delete(int id);
    void update(UpdateVehicleRequest updateVehicleRequest);

    GetVehicleResponse getById(int id);

    List<GetAllVehiclesResponse> getAll();
}
