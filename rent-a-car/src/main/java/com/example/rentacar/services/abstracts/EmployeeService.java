 package com.example.rentacar.services.abstracts;

import com.example.rentacar.services.dtos.employee.request.AddEmployeeRequest;
import com.example.rentacar.services.dtos.employee.request.UpdateEmployeeRequest;
import com.example.rentacar.services.dtos.employee.response.GetAllEmployeeResponse;
import com.example.rentacar.services.dtos.employee.response.GetEmployeeResponse;
import com.example.rentacar.services.dtos.vehicle.requests.AddVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.requests.UpdateVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.responses.GetAllVehiclesResponse;
import com.example.rentacar.services.dtos.vehicle.responses.GetVehicleResponse;

import java.util.List;

public interface EmployeeService {
    void add(AddEmployeeRequest request);
    void delete(int id);
    void update(UpdateEmployeeRequest updateEmployeeRequest);

    GetEmployeeResponse getById(int id);

    List<GetEmployeeResponse> getAll();
}
