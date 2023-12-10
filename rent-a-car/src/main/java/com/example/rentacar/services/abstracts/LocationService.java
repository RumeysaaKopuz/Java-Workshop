package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.location.request.AddLocationRequest;
import com.example.rentacar.services.dtos.location.request.UpdateLocationRequest;
import com.example.rentacar.services.dtos.location.response.GetLocationResponse;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    void add(AddLocationRequest addLocationRequest);
    void delete(int id );
    void update(UpdateLocationRequest updateLocationRequest);
    GetLocationResponse getById(int id);
    List<GetLocationResponse> getAll();


}
